package com.realdolmen.rdflights.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.realdolmen.rdflights.domain.Flight;
import com.realdolmen.rdflights.repository.AirlineCompanyRepository;

@Stateless
@LocalBean
public class AirlineCompanyServiceBean implements AirlineCompanyServiceRemote {

	@EJB
	AirlineCompanyRepository acr;
		
	@Override
	public List<Flight> getAllFlights(Long id) {
		// TODO Auto-generated method stub
		return acr.getAllFLights(id);
	}

	@Override
	public void deleteFlight(long flightId) {
		// TODO Auto-generated method stub
		acr.deleteFlight(flightId);
	}

	@Override
	public Flight save(Flight f) {
		// TODO Auto-generated method stub
		return acr.save(f);
	}

	@Override
	public void updateFlight(Flight f) {
		// TODO Auto-generated method stub
		acr.updateFlight(f);
	}
}
