package com.realdolmen.rdflights.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.realdolmen.rdflights.domain.Booking;
import com.realdolmen.rdflights.domain.Ticket;
import com.realdolmen.rdflights.domain.User;


@Stateless
@Transactional
public class BookingRepository {
	
	 private Logger logger = LoggerFactory.getLogger(getClass());
	 
    @PersistenceContext(unitName="rdflightsPU")
    EntityManager em;
 
	 public void saveBooking(Booking b){
		 em.persist(b);
	 }

}
