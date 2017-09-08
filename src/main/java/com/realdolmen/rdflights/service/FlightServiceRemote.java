package com.realdolmen.rdflights.service;

import java.util.Date;
import java.util.List;
import javax.ejb.Remote;
import com.realdolmen.rdflights.domain.Flight;

@Remote
public interface FlightServiceRemote {
	
    Flight saveFlight (Flight flight);
    Flight findFlightById(Long id);
    List<Flight> findAllFlights();
    List<Flight> findAllFlightsByCriteria(Long airportDeparture, Long airportArrival, Date departuredate , Date returndate);
    void removeFlight(long personId);
}
