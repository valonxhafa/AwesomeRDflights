package com.realdolmen.rdflights.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Flight extends AbstractMaster {
	
	@ManyToOne
	private Airport airportArrival;
	@ManyToOne
	private Airport airportDeparture;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date arrivalTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date departureTime;
	@ManyToOne
	private User airlineCompany;
	@NotNull
	private String flightNumber;
	
	//private Travel travelReport;
	
	public Flight() {
		super();
	}

	public Airport getAirportArrival() {
		return airportArrival;
	}

	public void setAirportArrival(Airport airportArrival) {
		this.airportArrival = airportArrival;
	}

	public Airport getAirportDeparture() {
		return airportDeparture;
	}

	public void setAirportDeparture(Airport airportDeparture) {
		this.airportDeparture = airportDeparture;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public User getAirlineCompany() {
		return airlineCompany;
	}

	public void setAirlineCompany(User airlineCompany) {
		this.airlineCompany = airlineCompany;
	}
	
/*
	public Travel getTravelReport() {
		return travelReport;
	}

	public void setTravelReport(Travel travelReport) {
		this.travelReport = travelReport;
	}
*/
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	
	
	
	
	
}
