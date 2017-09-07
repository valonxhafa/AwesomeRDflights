package com.realdolmen.rdflights.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
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

}
