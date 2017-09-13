package com.realdolmen.rdflights.service;

import java.util.List;

import javax.ejb.Remote;
import com.realdolmen.rdflights.domain.Flight;

@Remote
public interface AirlineCompanyServiceRemote {

	List<Flight> getAllFlights(Long id);
	void deleteFlight(long flightId);
	Flight save(Flight f);
	void updateFlight(Flight f);
	
}
