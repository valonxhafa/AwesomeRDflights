package com.realdolmen.rdflights.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Airport extends AbstractMaster{
	
	
	@NotBlank
	private String airportCode;
	@NotBlank
	private String airportName;
	@NotBlank
	private String country;
	@NotNull
	private boolean availabilty;
	@ManyToOne
	private Region region;
	
	
	public Airport() {
		super();
	}
	
	//-------------------------------------------------//
	public String getCode() {
		return airportCode;
	}
	public void setCode(String code) {
		this.airportCode = code;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isAvailabilty() {
		return availabilty;
	}
	public void setAvailabilty(boolean availabilty) {
		this.availabilty = availabilty;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	
	
	
	
}
