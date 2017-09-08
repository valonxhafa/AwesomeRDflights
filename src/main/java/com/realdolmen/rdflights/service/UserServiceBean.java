package com.realdolmen.rdflights.service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.repository.UserRepository;

@Stateless
@LocalBean
public class UserServiceBean implements UserServiceRemote{
	
	@EJB
	UserRepository ur;
	
	@Override
	public User save(User user) {
		return ur.save(user);
	}

}
