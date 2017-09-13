package com.realdolmen.rdflights.service;

import java.util.List;

import javax.ejb.Remote;
import com.realdolmen.rdflights.domain.Flight;

@Remote
public interface AirlineCompanyServiceRemote {

	List<Flight> getAllFlights(Long id);
	void deleteFlight(long flightId);
	void save(Flight f, Long Id, Long depId, Long arrId);
	void updateFlight(Flight f);
	
}
