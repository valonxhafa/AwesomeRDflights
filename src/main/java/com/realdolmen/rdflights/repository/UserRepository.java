package com.realdolmen.rdflights.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import com.realdolmen.rdflights.domain.User;

@Stateless
public class UserRepository {
	@PersistenceUnit
	EntityManager em;
	
	public User save(User user){
		em.persist(user);
		return user;
	}
	public User findByEmail(String email){
		return em.createQuery("select u from User u where u.getEmail = :email", User.class).getSingleResult();
	}
}
