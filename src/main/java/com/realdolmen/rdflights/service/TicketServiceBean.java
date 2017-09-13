package com.realdolmen.rdflights.service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.realdolmen.rdflights.domain.Ticket;
import com.realdolmen.rdflights.domain.User;
import com.realdolmen.rdflights.repository.TicketRepository;

@Stateless
@LocalBean
public class TicketServiceBean implements TicketServiceRemote {

    @EJB
    TicketRepository ticketrepo;
	
	@Override
	public Ticket saveTicket(Ticket ticket) {
		return ticketrepo.saveTicket(ticket);
	}

}
