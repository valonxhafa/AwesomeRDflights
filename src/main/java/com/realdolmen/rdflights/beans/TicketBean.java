package com.realdolmen.rdflights.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.realdolmen.rdflights.domain.Ticket;

@ManagedBean
@RequestScoped
public class TicketBean {
	
	private List<Ticket> tickets ;
	
    @PostConstruct
    public void postConstruct(){
    	System.out.println("TEST TEST TES");
    }

  

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
    
    
}
