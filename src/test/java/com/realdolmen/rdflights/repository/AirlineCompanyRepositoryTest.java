package com.realdolmen.rdflights.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.realdolmen.rdflights.AbstractPersistenceTest;
import com.realdolmen.rdflights.domain.Flight;

public class AirlineCompanyRepositoryTest extends AbstractPersistenceTest  {

	private AirlineCompanyRepository repo;

    @Before
    public void initializeRepository() {
    	repo = new AirlineCompanyRepository();
    	repo.em = em;
    }
    
    @Test
    public void getAirlineCompanyFlights() {
        List<Flight> flights = repo.getAllFLights(7);
        assertNotNull(flights);
        assertEquals(1, flights.size());
        System.out.println(flights);
    }
}
