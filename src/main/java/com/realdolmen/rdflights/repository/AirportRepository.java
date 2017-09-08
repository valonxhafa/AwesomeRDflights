package com.realdolmen.rdflights.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.realdolmen.rdflights.domain.Airport;

@Stateless
public class AirportRepository {
	
    private Logger logger = LoggerFactory.getLogger(getClass());

    @PersistenceContext(unitName="rdflightsPU")
    EntityManager em;
    
    public List<Airport> findAll() {
        return em.createQuery("select a from Airport a", Airport.class).getResultList();
    }
    
    public Airport findById(Long id) {
        try {
            return em.find(Airport.class, id);
        } catch (NoResultException e) {
            logger.error("Error: ", e);
        }
        return null;
    }

}
