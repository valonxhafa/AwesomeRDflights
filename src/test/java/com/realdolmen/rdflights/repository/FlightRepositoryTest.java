package com.realdolmen.rdflights.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.realdolmen.rdflights.AbstractPersistenceTest;
import com.realdolmen.rdflights.domain.Flight;

public class FlightRepositoryTest extends AbstractPersistenceTest {
	
	private FlightRepository flightRepository;

    @Before
    public void initializeRepository() {
    	flightRepository = new FlightRepository();
    	flightRepository.em = em;
    }
    
    @Test
    public void shouldReturnAllFlights() {
        List<Flight> flights = flightRepository.findAll();
        assertNotNull(flights);
        assertEquals(14, flights.size());
    }
}
