package com.realdolmen.rdflights.service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.realdolmen.rdflights.domain.Booking;
import com.realdolmen.rdflights.repository.BookingRepository;

@Stateless
@LocalBean
public class BookingServiceBean implements BookingServicerRemote {

	@EJB
	BookingRepository br;
	@Override
	public Booking saveBooking(Booking b) {
		// TODO Auto-generated method stub
		br.saveBooking(b);
		return b;
	}
	
	
}
