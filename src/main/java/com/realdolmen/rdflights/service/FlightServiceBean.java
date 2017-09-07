package com.realdolmen.rdflights.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.repository.FlightRepository;

@Stateless
@LocalBean
public class FlightServiceBean implements FlightServiceRemote {
	
    @EJB
    FlightRepository flightRepo;

	@Override
	public Flight saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight findFlightById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> findAllFlights() {
		return flightRepo.findAll();
	}

	@Override
	public void removeFlight(long personId) {
		// TODO Auto-generated method stub
		
	}

}
