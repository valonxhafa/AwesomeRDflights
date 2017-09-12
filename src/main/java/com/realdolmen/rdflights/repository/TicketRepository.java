package com.realdolmen.rdflights.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.domain.Ticket;
import com.realdolmen.rdflights.domain.User;

@Stateless
public class TicketRepository {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @PersistenceContext(unitName="rdflightsPU")
    EntityManager em;
    
    public Ticket saveTicket(Ticket ticket, User passenger ) {
    	em.persist(passenger);
		ticket.setPassenger(passenger);
		em.persist(ticket);
        return ticket;
    }
}
