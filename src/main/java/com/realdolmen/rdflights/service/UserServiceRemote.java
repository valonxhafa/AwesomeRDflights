package com.realdolmen.rdflights.service;

import javax.ejb.Remote;

import com.realdolmen.rdflights.domain.User;

@Remote
public interface UserServiceRemote {
	User save(User user);
}
