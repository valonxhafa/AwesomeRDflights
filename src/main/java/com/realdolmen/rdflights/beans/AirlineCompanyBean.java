package com.realdolmen.rdflights.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;


import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.service.AirlineCompanyServiceBean;

@ManagedBean
@ViewScoped
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
	
	@Inject
	AirlineCompanyServiceBean asb;
	
	List<Flight> flights;

	
	@PostConstruct
	public void init(){
		Long id = acId;
		flights = asb.getAllFlights(id);
		for (Flight f : flights) {
			departureTime 	= f.getDepartureTime();
			arrivalTime 	= f.getArrivalTime();
			flightNumber 	= f.getFlightNumber();
		}
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
	
}
