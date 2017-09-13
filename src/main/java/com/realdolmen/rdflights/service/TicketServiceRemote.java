package com.realdolmen.rdflights.service;
import javax.ejb.Remote;

import com.realdolmen.rdflights.domain.Ticket;
import com.realdolmen.rdflights.domain.User;

@Remote
public interface TicketServiceRemote {
	
	Ticket saveTicket (Ticket ticket);
}
