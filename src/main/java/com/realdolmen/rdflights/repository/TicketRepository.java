package com.realdolmen.rdflights.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.realdolmen.rdflights.domain.Ticket;


@Stateless
public class TicketRepository {

    @PersistenceContext(unitName="rdflightsPU")
    EntityManager em;
    
    
    public Ticket saveTicket( Ticket ticket ) {
 		em.persist(ticket);
         return ticket;
     }
    
}
