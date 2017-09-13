package com.realdolmen.rdflights.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class Flight extends AbstractMaster {
	
	@ManyToOne
	private Airport airportDeparture;
	
	@ManyToOne
	private Airport airportArrival;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date departureTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date arrivalTime;
	
	@ManyToOne
	private User airlineCompany;
	
	//@NotNull
	private String flightNumber;

	@OneToMany
	private List<Ticket> tickets;
	
	//private Travel travelReport;
	//private Travel basePrice;
	
	//This variable is used to show editable or text view to the use (first usage in AirlineCompanyBean)
	@Transient
	private boolean editable;

	
	public Flight() {
		super();
	}

	public Flight(Date departureTime, String flightNumber) {
		super();
		this.departureTime = departureTime;
		this.flightNumber = flightNumber;
	}
 
	/*Flight WITH baseprice*/
	public Flight(Date departureTime,Date arrivalTime, String flightNumber) {
		super();
		this.departureTime 	= departureTime;
		this.flightNumber 	= flightNumber;
		this.arrivalTime 	= arrivalTime;
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
	
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	
}
