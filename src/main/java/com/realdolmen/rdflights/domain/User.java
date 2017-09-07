package com.realdolmen.rdflights.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User extends AbstractMaster {

    private String firstName;
    private String lastName;
    @Embedded
    private Address address;

    private String gender;
    @Enumerated(EnumType.STRING)
    private Role role;
    
    @Column(unique = true)
    private String email;
    private String password;
    private String tel;
    private Date birthDate;
    
    /* Fields AirlineCompany */ 
    private String airlineCompanyCode;
    private String airlineCompanyName;
    private String airlineCompanydescription;

    
    public User() {
    }
    public User(String firstName, String lastName, Date birthDate,String gender, Role role) {
        this.firstName 	= firstName;
        this.lastName 	= lastName;
        this.birthDate 	= birthDate;
        this.gender		= gender;
        this.role	 	= role;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	
	/*Getters and setter AirlineCompany*/
	public String getAirlineCompanyCode() {
		return airlineCompanyCode;
	}
	public void setAirlineCompanyCode(String airlineCompanyCode) {
		this.airlineCompanyCode = airlineCompanyCode;
	}
	public String getAirlineCompanyName() {
		return airlineCompanyName;
	}
	public void setAirlineCompanyName(String airlineCompanyName) {
		this.airlineCompanyName = airlineCompanyName;
	}
	public String getAirlineCompanyDescription() {
		return airlineCompanydescription;
	}
	public void setAirlineCompanyDescription(String airlineCompanydescription) {
		this.airlineCompanydescription = airlineCompanydescription;
	}
    
}
