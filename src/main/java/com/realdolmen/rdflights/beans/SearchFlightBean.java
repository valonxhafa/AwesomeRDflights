package com.realdolmen.rdflights.beans;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import com.realdolmen.rdflights.domain.Airport;
import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.domain.Ticket;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.service.AirportServiceBean;
import com.realdolmen.rdflights.service.FlightServiceBean;

@ManagedBean
@SessionScoped
public class SearchFlightBean {
	
	private Long airportDeparture;
	private Long airportArrival;
	private Date departureTime;
	private Date arrivalTime;
	private Date returnDate;
	private String tempDepTime;
	private User airlineCompany;
	private String flightNumber;
	private List<Airport> airports;
	private List<Flight> flights;
	private Date currentDate;
	private Integer passengersquantity;
    @Inject
    private FlightServiceBean flightService;
    @Inject
    private AirportServiceBean airportService;
    
    @PostConstruct
    public void postConstruct(){
       airports =  airportService.findAllAirports(); //fill list to use on search departure/destination 
       currentDate = Calendar.getInstance().getTime();
    }

  //-----------------------METHODS---------------------------------------//
    
    public String findAirportById(Long id){
        return airportService.findAirportById(id).getAirportName();
    }
    

	public List<Flight> findAllFlights() {
        return flightService.findAllFlights();
    }
    
    public String findAllFlightsByCriteria() {
        flights =  flightService.findAllFlightsByCriteria(airportDeparture, airportArrival, departureTime, returnDate);
        return "flightresults";
    }
    
    public void saveFlight() {
    	Flight flight = new Flight(departureTime,"hey..");
    	flightService.saveFlight(flight);
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

	public void setDepartureTime(java.util.Date departureTime) {

		
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

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getTempDepTime() {
		return tempDepTime;
	}

	public void setTempDepTime(String tempDepTime) {
		this.tempDepTime = tempDepTime;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getPassengersquantity() {
		return passengersquantity;
	}

	public void setPassengersquantity(Integer passengersquantity) {
		this.passengersquantity = passengersquantity;
	}
	
	  public String saveTickets(Long id) {
	    	System.out.println("SAVING TICKETS-----");
	        return "ticketforms";
	    }
	
    
	
    
}
