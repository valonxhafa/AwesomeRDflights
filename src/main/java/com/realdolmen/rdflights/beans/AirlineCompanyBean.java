package com.realdolmen.rdflights.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;


import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.service.AirlineCompanyServiceBean;
import com.realdolmen.rdflights.service.FlightServiceBean;

@ManagedBean
@RequestScoped
public class AirlineCompanyBean implements Serializable  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{loginBean.airlineCompanyId}")
    private Long acId;
	
	private Date departureTime;
	private Date arrivalTime;
	private String flightNumber;
	private Long airportId;
	private String airportDepName;
	private String airportArName;
	
	private Flight flight;
	
	@Inject
	AirlineCompanyServiceBean asb;
	@Inject
	FlightServiceBean fsb;
	
	List<Flight> flights;

	
	@PostConstruct
	public void init(){
		Long id = acId;
		flights = asb.getAllFlights(id);
		for (Flight f : flights) {
			departureTime 	= f.getDepartureTime();
			arrivalTime 	= f.getArrivalTime();
			flightNumber 	= f.getFlightNumber();
			airportArName	= f.getAirportArrival().getAirportName();
			airportDepName	= f.getAirportDeparture().getAirportName();
			
		}
	}
	public Flight save(Flight f){
		fsb.saveFlight(f);
		return f;
	}
	public void deleteFlight(Long flightId){
		asb.deleteFlight(flightId);
	}
	
	public void updateFlight(Flight f){
		asb.updateFlight(f);
	}
	
	public Flight saveFlight(Flight f){
		return asb.save(f);
	}
	
	
	
	public List<Flight> getFlights() {
		return flights;
	}
	
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}


	public Date getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}


	public Date getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public Long getAcId() {
		return acId;
	}
	public void setAcId(Long acId) {
		this.acId = acId;
	}

	public Long getAirportId() {
		return airportId;
	}

	public void setAirportId(Long airportId) {
		this.airportId = airportId;
	}

	public String getAirportDepName() {
		return airportDepName;
	}

	public void setAirportDepName(String airportDepName) {
		this.airportDepName = airportDepName;
	}

	public String getAirportArName() {
		return airportArName;
	}

	public void setAirportArName(String airportArName) {
		this.airportArName = airportArName;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
