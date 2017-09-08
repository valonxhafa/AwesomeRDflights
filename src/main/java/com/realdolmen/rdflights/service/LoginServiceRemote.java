package com.realdolmen.rdflights.service;

import com.realdolmen.rdflights.domain.User;

public interface LoginServiceRemote {
	 boolean checkCredentials(String email, String password);
	 User findByEmail(String email);
}
