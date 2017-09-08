package com.realdolmen.rdflights.service;

import java.util.List;

import javax.ejb.Remote;

import com.realdolmen.rdflights.domain.Airport;
import com.realdolmen.rdflights.domain.Flight;

@Remote
public interface AirportServiceRemote {
	
    List<Airport> findAllAirports();
    Airport findAirportById(Long id);

}
