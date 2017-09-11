package com.realdolmen.rdflights.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.realdolmen.rdflights.domain.Flight;

@Stateless
public class AirlineCompanyRepository {

	@PersistenceContext
	EntityManager em;
	
	public List<Flight> getAllFLights(long id){
		return em.createQuery("SELECT f FROM Flight f WHERE f.airlineCompany.id = :id", Flight.class).setParameter("id", id).getResultList();
	}

}
