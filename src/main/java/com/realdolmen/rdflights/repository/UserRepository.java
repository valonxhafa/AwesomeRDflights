package com.realdolmen.rdflights.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.realdolmen.rdflights.domain.User;

@Stateless
public class UserRepository {
	
	@PersistenceContext(name="rdflightsPU")
	EntityManager em;
	

	public User save(User user){
		em.persist(user);
		return user;
	}
	
}
