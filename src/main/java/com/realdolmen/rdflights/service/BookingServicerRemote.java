package com.realdolmen.rdflights.service;

import javax.ejb.Remote;

import com.realdolmen.rdflights.domain.Booking;

@Remote
public interface BookingServicerRemote {
	Booking saveBooking(Booking b);
}
