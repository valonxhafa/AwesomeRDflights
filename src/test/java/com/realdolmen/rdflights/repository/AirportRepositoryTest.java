package com.realdolmen.rdflights.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.realdolmen.rdflights.AbstractPersistenceTest;
import com.realdolmen.rdflights.domain.Airport;

public class AirportRepositoryTest extends AbstractPersistenceTest {
	
	private AirportRepository airportRepo;

    @Before
    public void initializeRepository() {
    	airportRepo = new AirportRepository();
    	airportRepo.em = em;
    }
    
    @Test
    public void shouldReturnAllAirports() {
        List<Airport> airports = airportRepo.findAll();
        assertNotNull(airports);
        assertEquals(58, airports.size());
    }

}
