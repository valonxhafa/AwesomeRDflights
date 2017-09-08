package com.realdolmen.rdflights.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.realdolmen.rdflights.domain.User;

@Stateless
public class LoginRepository {

	@PersistenceContext
	EntityManager em;

	public boolean checkCredentials(String email, String password) {	
		 try{
			em.createQuery("Select u from User u where u.email = :email and u.password = :password", User.class)
					 .setParameter("email", email)
					 .setParameter("password", password)
					 .getSingleResult(); 
			 return true;
		 }catch (NoResultException e){
			 return false;
		 }
	}
	public User findByEmail(String email){
		return em.createQuery("select u from User u where u.email = :email", User.class).setParameter("email", email).getSingleResult();
	}
}
