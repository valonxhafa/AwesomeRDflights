package com.realdolmen.rdflights.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Airport extends AbstractMaster{
	

	private String airportCode;

	private String airportName;

	private String country;

	private boolean available;
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
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	
	
	
	
}
