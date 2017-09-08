package com.realdolmen.rdflights.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.hibernate.validator.constraints.NotBlank;

import com.realdolmen.rdflights.service.LoginServiceBean;


@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotBlank
	private String email;
	@NotBlank
	private String password;
	private String errorString;
	
	@Inject
	LoginServiceBean lsb;
	
	
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
	
	public String getErrorString() {
		return errorString;
	}
	public void setErrorString() {
		this.errorString = "Incorrect Username and Passowrd";
	}
	public LoginBean(){
	}
	public String checkCredentials(){
		Boolean credOk = lsb.checkCredentials(getEmail(), getPassword());
		if(credOk){
//			HttpSession session = SessionUtils.getSession();
//			session.setAttribute("username", User u);
			return "index";
		}else{
			FacesContext.getCurrentInstance().addMessage(
					null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Incorrect Username and Passowrd",
					"Please enter correct username and Password"));
			return "login";
		}
	}
}
