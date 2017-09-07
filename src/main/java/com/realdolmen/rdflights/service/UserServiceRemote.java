package com.realdolmen.rdflights.service;

import com.realdolmen.rdflights.domain.User;

public interface UserServiceRemote {
	User save(User user);
	User findByEmail(User u);
}
