package com.realdolmen.rdflights.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.realdolmen.rdflights.domain.Airport;
import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.domain.User;

@Stateless
public class AirlineCompanyRepository {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@PersistenceContext
	EntityManager em;
	
	public List<Flight> getAllFLights(long id){
		return em.createQuery("SELECT f FROM Flight f WHERE f.airlineCompany.id = :id", Flight.class).setParameter("id", id).getResultList();
	}
	
	public void deleteFlight(long flightId){
		logger.info("Removing flight with id " + flightId);
        em.remove(em.getReference(Flight.class, flightId));
        em.flush();
	}
	public void save(Flight f, long Id, long depId, long arrId){
		User ac = em.createQuery("SELECT u FROM User u WHERE u.id = :id",User.class).setParameter("id", Id).getSingleResult();
		Airport dep = em.createQuery("SELECT a FROM Airport a WHERE a.id = :id",Airport.class).setParameter("id", depId).getSingleResult();
		Airport arr = em.createQuery("SELECT a FROM Airport a WHERE a.id = :id",Airport.class).setParameter("id", arrId).getSingleResult();
		f.setAirlineCompany(ac);
		f.setAirportArrival(arr);
		f.setAirportDeparture(dep);
		em.persist(f);
		em.flush();
	}
	public void updateFlight(Flight f){
		em.merge(f);
		em.flush();
	}

}
