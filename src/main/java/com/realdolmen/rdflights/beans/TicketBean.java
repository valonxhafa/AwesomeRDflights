package com.realdolmen.rdflights.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.realdolmen.rdflights.domain.Ticket;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.service.FlightServiceBean;
import com.realdolmen.rdflights.service.TicketServiceBean;

@ManagedBean
@RequestScoped
public class TicketBean {
	
	private User passenger;
	private Ticket ticket;
	
    @Inject
    private TicketServiceBean ticketService;

	@ManagedProperty(value = "#{searchFlightBean.tickets}")
	private List<Ticket> tickets ;
	
	@ManagedProperty(value="#{searchFlightBean.passengersquantity}")
	private int passengersquantity = 0;
	
	public void saveTicket(){
		ticketService.saveTicket(ticket, passenger);
	}
	
    @PostConstruct
    public void postConstruct(){
		passenger = new User();
		ticket = new Ticket();
    }     
    
	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public int getPassengersquantity() {
		return passengersquantity;
	}

	public User getPassenger() {
		return passenger;
	}

	public void setPassenger(User passenger) {
		this.passenger = passenger;
	}

	public void setPassengersquantity(int passengersquantity) {
		this.passengersquantity = passengersquantity;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
    
}
