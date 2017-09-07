package com.realdolmen.rdflights.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.service.FlightServiceBean;

@Named
@RequestScoped
public class FlightBean {
	
    @Inject
    private FlightServiceBean flightService;

    public List<Flight> findAllFlights() {
        return flightService.findAllFlights();
    }
    
    public List<Flight> findAllFlightsByCriteria(Long airportDeparture, Long airportArrival) {
        return flightService.findAllFlightsByCriteria(airportDeparture, airportArrival);
    }

}
