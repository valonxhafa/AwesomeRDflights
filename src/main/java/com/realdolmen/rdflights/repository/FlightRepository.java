package com.realdolmen.rdflights.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.realdolmen.rdflights.domain.Flight;

@Stateless
public class FlightRepository {
	
    private Logger logger = LoggerFactory.getLogger(getClass());

    @PersistenceUnit
    EntityManager em;
    
    public List<Flight> findAll() {
        return em.createQuery("select f from Flight f", Flight.class).getResultList();
    }

}
