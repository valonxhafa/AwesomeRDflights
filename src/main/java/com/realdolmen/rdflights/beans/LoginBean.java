package com.realdolmen.rdflights.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import com.realdolmen.rdflights.domain.Role;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.service.LoginServiceBean;
import com.realdolmen.rdflights.util.SessionUtils;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;

	private String erroMsg;
	private User user;
	private String loggedinUser;
	private String airlineCompany;
	private Long airlineCompanyId;
	
	private Role role;

	@Inject
	LoginServiceBean lsb;

	public Long getAirlineCompanyId() {
		return airlineCompanyId;
	}

	public void setAirlineCompanyId(Long airlineCompanyId) {
		this.airlineCompanyId = airlineCompanyId;
	}

	public String getAirlineCompany() {
		return airlineCompany;
	}

	public void setAirlineCompany(String airlineCompany) {
		this.airlineCompany = airlineCompany;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLoggedinUser() {
		return loggedinUser;
	}

	public void setLoggedinUser(String loggedinUser) {
		this.loggedinUser = loggedinUser;
	}

	public LoginBean() {
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String checkCredentials() {
		Boolean credOk = lsb.checkCredentials(getEmail(), getPassword());
		if (credOk){
			user = lsb.findByEmail(getEmail());
			setLoggedinUser(user.getFirstName());
			if(user.getRole().equals(Role.AIRLINECOMPANY)){
				airlineCompany 		= user.getAirlineCompanyName();
				airlineCompanyId	= user.getId();
				return "indexPartner";
			}else{
				return "index";
			}
		}else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Incorrect Username and Passwrd", "Please enter a correct username and Password"));
			setErroMsg("Please enter correct username and Password");
			
			return "login";
		}
	}

	 //logout event, invalidate session
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login";
	}

	public String getErroMsg() {
		return erroMsg;
	}

	public void setErroMsg(String erroMsg) {
		this.erroMsg = erroMsg;
	}
}
