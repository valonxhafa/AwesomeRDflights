package com.realdolmen.rdflights.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import com.realdolmen.rdflights.domain.Airport;
import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.service.AirportServiceBean;
import com.realdolmen.rdflights.service.FlightServiceBean;
import org.primefaces.event.SelectEvent;

@ManagedBean
public class SearchFlightBean {
	
	private Long airportArrival;
	private Long airportDeparture;
	private Date arrivalTime;
	private Date departureTime;
	private User airlineCompany;
	private String flightNumber;
	private List<Airport> airports;
	private List<Flight> flights;
    @Inject
    private FlightServiceBean flightService;
    @Inject
    private AirportServiceBean airportService;
    
    @PostConstruct
    public void postConstruct(){
       airports =  airportService.findAllAirports(); //fill list to use on search departure/destination 
    }
    
  //-----------------------METHODS---------------------------------------//
    
    //Nodig voor Calendar (dat nog niet werkt)
    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
    
    public String findAirportById(Long id){
        return airportService.findAirportById(id).getAirportName();
    }
    
    public List<Flight> findAllFlights() {
        return flightService.findAllFlights();
    }
    
    public String findAllFlightsByCriteria() {
        //flights =  flightService.findAllFlightsByCriteria(airportDeparture, airportArrival, departureTime, arrivalTime);
        return "flightresults";
    }
    

    //-----------------------GETTERS/SETTERS---------------------------------------//

    
	public List<Airport> getAirports() {
		return airports;
	}

	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}

	public AirportServiceBean getAirportService() {
		return airportService;
	}

	public void setAirportService(AirportServiceBean airportService) {
		this.airportService = airportService;
	}

	public Long getAirportArrival() {
		return airportArrival;
	}

	public void setAirportArrival(Long airportArrival) {
		this.airportArrival = airportArrival;
	}

	public Long getAirportDeparture() {
		return airportDeparture;
	}

	public void setAirportDeparture(Long airportDeparture) {
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

	public FlightServiceBean getFlightService() {
		return flightService;
	}

	public void setFlightService(FlightServiceBean flightService) {
		this.flightService = flightService;
	}
    
    
}
