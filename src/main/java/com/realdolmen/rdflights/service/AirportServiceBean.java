package com.realdolmen.rdflights.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.realdolmen.rdflights.domain.Airport;
import com.realdolmen.rdflights.repository.AirportRepository;

@Stateless
@LocalBean
public class AirportServiceBean implements AirportServiceRemote {
	
    @EJB
    AirportRepository airportRepo;

	@Override
	public List<Airport> findAllAirports() {
		return airportRepo.findAll();
	}

	@Override
	public Airport findAirportById(Long id) {
		return airportRepo.findById(id);
	}

}
