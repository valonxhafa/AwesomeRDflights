package com.realdolmen.rdflights.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.realdolmen.rdflights.domain.Flight;

@Stateless
public class AirlineCompanyRepository {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@PersistenceContext
	EntityManager em;
	
	public List<Flight> getAllFLights(long id){
		return em.createQuery("SELECT f FROM Flight f WHERE f.airlineCompany.id = :id", Flight.class).setParameter("id", id).getResultList();
	}
	
	public void deleteFlight(long flightId){
		logger.info("Removing person with id " + flightId);
        em.remove(em.getReference(Flight.class, flightId));
	}
	public Flight save(Flight f){
		em.persist(f);
		return f;
	}
	public void updateFlight(Flight f){
		em.merge(f);
		em.flush();
	}

}
