package com.realdolmen.rdflights.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import com.realdolmen.rdflights.domain.Airport;
import com.realdolmen.rdflights.domain.Booking;
import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.domain.Ticket;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.service.AirportServiceBean;
import com.realdolmen.rdflights.service.BookingServiceBean;
import com.realdolmen.rdflights.service.FlightServiceBean;
import com.realdolmen.rdflights.service.TicketServiceBean;

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
	private List<Ticket> tickets = new ArrayList<>();
	private Date currentDate;
	private int passengersquantity;
	private Long booking_id;
	private Booking booking;
	
	
    @Inject
    private FlightServiceBean flightService;
    @Inject
    private AirportServiceBean airportService;
    @Inject
    private TicketServiceBean ticketService;
    @Inject
    private BookingServiceBean bsb;
    @PostConstruct
    public void postConstruct(){
       airports =  airportService.findAllAirports(); //fill list to use on search departure/destination 
       currentDate = Calendar.getInstance().getTime();
    }

    
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
    
	public String saveTickets() {
		FillEmptyTicketList();
		passengersquantity = 0;
		
        return "ticketforms";
    }
    

    public void FillEmptyTicketList(){
    	booking = new Booking();
    	bsb.saveBooking(booking);
    	for (int i = 0; i < passengersquantity; i++) {
        	Ticket ticket = new Ticket();
        	User passenger = new User();
        	Flight flight = new Flight();
        	//flight.setAirportDeparture(airportDeparture);
        	ticket.setFlight(flight);
        	ticket.setPassenger(passenger);
        	tickets.add(ticket);
		}

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
	
	public int getPassengersquantity() {
		return passengersquantity;
	}

	public void setPassengersquantity(int passengersquantity) {
		this.passengersquantity = passengersquantity;
	}

	
	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}


	public Long getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(Long booking_id) {
		this.booking_id = booking_id;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	
}
