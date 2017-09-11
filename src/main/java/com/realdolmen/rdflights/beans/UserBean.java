package com.realdolmen.rdflights.beans;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.realdolmen.rdflights.domain.Address;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.service.UserServiceBean;

@ManagedBean
@RequestScoped
public class UserBean {
	
	private User user;
	
	@Inject
	UserServiceBean usb;
	
	@PostConstruct
	public void prepare() {
		user = new User();
		user.setAddress(new Address());
	}

	public User getUser() {
		return user;
	}

	public void save() throws Exception {
		usb.save(user);
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect("login.jsf");
	}

}
