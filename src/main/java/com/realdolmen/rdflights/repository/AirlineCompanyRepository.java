package com.realdolmen.rdflights.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AirlineCompanyRepository {
	
	@PersistenceContext
	EntityManager em;
	
}
