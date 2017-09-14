package com.realdolmen.rdflights.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

@Entity
public class User extends AbstractMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotBlank
	private String firstName;
//	@NotBlank
    private String lastName;
    
    @Embedded
    private Address address;

//    @NotBlank
    private String gender;
    @Enumerated(EnumType.STRING)
    private Role role;
    
    @Column(unique = true)
//    @NotBlank
    private String email;
    private String password;
    private String tel;
    private Date birthDate;
    
    /* Fields AirlineCompany */ 
    private String airlineCompanyCode;
    private String airlineCompanyName;
    private String airlineCompanydescription;
    @Transient
    private int passenger_counter;
    
    public User() {
    }
    
    /*CONSTRUCTOR FOR USER*/
    public User(String firstName, String lastName,String email, String passw, Date birthDate,String gender) {
        this.firstName 	= firstName;
        this.lastName 	= lastName;
        this.email		= email;
        this.password	= passw;
        this.birthDate 	= birthDate;
        this.gender		= gender;
        this.role	 	= Role.CUSTOMER;
    }
    
    public User(String firstName, String lastName,String email, Date birthDate,String gender) {
        this.firstName 	= firstName;
        this.lastName 	= lastName;
        this.email		= email;
        this.birthDate 	= birthDate;
        this.gender		= gender;
        this.role	 	= Role.PASSENGER;
    }
   
    
    /*CONSTRUCTOR FOR AIRLINECOMPANY*/
    public User(String firstName, String lastName,String email, String passw,String gender, String airlineCompanyCode, String airlineCompanyName, String airlineCompanyDesc){
    	this.firstName 					= firstName;
        this.lastName 					= lastName;
        this.gender						= gender;
        this.email						= email;
        this.password					= passw;
        this.role	 					= Role.AIRLINECOMPANY;
        this.airlineCompanyCode 		= airlineCompanyCode;
        this.airlineCompanyName			= airlineCompanyName;
        this.airlineCompanydescription 	= airlineCompanyDesc;
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

	public String getAirlineCompanydescription() {
		return airlineCompanydescription;
	}

	public void setAirlineCompanydescription(String airlineCompanydescription) {
		this.airlineCompanydescription = airlineCompanydescription;
	}

	public int getPassenger_counter() {
		return passenger_counter;
	}

	public void setPassenger_counter(int passenger_counter) {
		this.passenger_counter = passenger_counter;
	}
	
	
    
}
