package com.realdolmen.rdflights.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import com.realdolmen.rdflights.domain.Airport;
import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.service.AirlineCompanyServiceBean;
import com.realdolmen.rdflights.service.AirportServiceBean;
import com.realdolmen.rdflights.service.FlightServiceBean;
import com.realdolmen.rdflights.util.ParseDate;

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
	private Long airportDepID;
	private Long airportArrID;
	private List<Airport> airports;
	private List<Flight> flights;
	private Flight flight;
	private String depTime;
	private String arrTime;
	
	
	@Inject
	AirportServiceBean airportService;
	@Inject
	AirlineCompanyServiceBean asb;
	@Inject
	FlightServiceBean fsb;
	
	
	

	@PostConstruct
	public void init(){
		flights = asb.getAllFlights(acId);
		for (Flight f : flights) {
			departureTime 	= f.getDepartureTime();
			arrivalTime 	= f.getArrivalTime();
			flightNumber 	= f.getFlightNumber();
			airportArName	= f.getAirportArrival().getAirportName();
			airportDepName	= f.getAirportDeparture().getAirportName();
			airportDepID	= f.getAirportDeparture().getId();
			airportArrID	= f.getAirportArrival().getId();
		}
		airports = airportService.findAllAirports();
		flight = new Flight();
	}

	public void deleteFlight(Long flightId){
		asb.deleteFlight(flightId);
		init();
	}
	
	public String updateFlight(Flight f){
		asb.updateFlight(f);
		for (Flight flight : flights) {
			flight.setEditable(false);
		}
		init();
		return null;
	}
	
	public String saveFlight(Flight f){
		asb.save(f,getAcId(), airportDepID, airportArrID);
		init();
		return null;
	}
	public String editFlight(Flight flight) {
		flight.setEditable(true);
		return null;
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

	public List<Airport> getAirports() {
		return airports;
	}

	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
		departureTime = new ParseDate().convertToDate(depTime);
		flight.setDepartureTime(departureTime);
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
		arrivalTime = new ParseDate().convertToDate(arrTime);
		flight.setArrivalTime(arrivalTime);
	}

	public Long getAirportDepID() {
		return airportDepID;
	}

	public void setAirportDepID(Long airportDepID) {
		this.airportDepID = airportDepID;
	}

	public Long getAirportArrID() {
		return airportArrID;
	}

	public void setAirportArrID(Long airportArrID) {
		this.airportArrID = airportArrID;
	}

	
}
