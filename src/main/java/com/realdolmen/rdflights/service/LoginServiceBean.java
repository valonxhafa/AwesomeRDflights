package com.realdolmen.rdflights.service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.repository.LoginRepository;

@Stateless
@LocalBean
public class LoginServiceBean implements LoginServiceRemote {
	
	@EJB
	LoginRepository lp;
	
	@Override
	public boolean checkCredentials(String email, String password) {
		return lp.checkCredentials(email, password);
	}

	@Override
	public User findByEmail(String email) {
		return lp.findByEmail(email);
	}

}
