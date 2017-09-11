package com.realdolmen.rdflights.repository;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.realdolmen.rdflights.domain.Flight;

@Stateless
public class FlightRepository {
	
    private Logger logger = LoggerFactory.getLogger(getClass());

    @PersistenceContext(unitName="rdflightsPU")
    EntityManager em;
    
    public Flight saveFlight(Flight flight) {
        em.persist(flight);
        return flight;
    }
    
    public List<Flight> findAll() {
        return em.createQuery("select f from Flight f", Flight.class).getResultList();
    }
    
    public Flight findFlightById(Long id) {
        return em.createQuery("select f from Flight f where f.id = :id", Flight.class).setParameter("id", id).getSingleResult();
    }
    
    public List<Flight> findAllFlightsByCriteria(Long airportDeparture, Long airportArrival, Date departureDate,
			Date returnDate) {
    	try {
        return em.createQuery("select f from Flight f where f.airportDeparture.id = :airportdeparture"
        		+ " AND f.airportArrival.id = :airportarrival"
        		+ " AND DATE(f.departureTime) = :departureDate", Flight.class)
        		//+ " AND DATE(f.returnDate) = :returnDate", Flight.class)
        		.setParameter("airportdeparture", airportDeparture)
        		.setParameter("airportarrival", airportArrival)
        		.setParameter("departureDate", departureDate )
        		//.setParameter("returnDate", returnDate)
        		//+ " DATE(f.departureTime) = :departureDate", Flight.class)
                .getResultList();
    	}
 
    	catch (NoResultException e) {
        logger.error("Oopsie, error was ----====", e);
    	}
    	
    	return Collections.emptyList();
    }
    

}
