package com.realdolmen.rdflights.service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.repository.FlightRepository;

@Stateless
@LocalBean
public class FlightServiceBean implements FlightServiceRemote {
	
    @EJB
    FlightRepository flightRepo;

	@Override
	public Flight saveFlight(Flight flight) {
		return flightRepo.saveFlight(flight);
	}

	@Override
	public Flight findFlightById(Long id) {
		// TODO Auto-generated method stub
		return flightRepo.findFlightById(id);
	}

	@Override
	public List<Flight> findAllFlights() {
		return flightRepo.findAll();
	}

	@Override
	public void removeFlight(long personId) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Flight> findAllFlightsByCriteria(Long airportDeparture, Long airportArrival, Date departuredate,
			Date returndate) {
		// TODO Auto-generated method stub
		return flightRepo.findAllFlightsByCriteria(airportDeparture, airportArrival, departuredate , returndate);
	}


}
