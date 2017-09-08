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
    
    public List<Flight> findAll() {
        return em.createQuery("select f from Flight f", Flight.class).getResultList();
    }
    
    public List<Flight> findAllFlightsByCriteria(Long airportDeparture, Long airportArrival, Date departureDate,
			Date returnDate) {
    	try {
        return em.createQuery("select f from Flight f where f.airportDeparture_id = :airportDeparture "
        		+ "AND f.airportArrival_id = :airportArrival"
        		+ "AND f.departureTime = :departureDate"
        		+ "AND f:returnDate = :returnDate", Flight.class)
                .setParameter("airportDeparture", airportDeparture )
                .setParameter("airportArrival", airportArrival )
                .setParameter("departureDate", departureDate )
                .setParameter("returnDate", returnDate )
                .getResultList();
    	}
 
    	catch (NoResultException e) {
        logger.error("Oops", e);
    	}
    	
    	return Collections.emptyList();
    	
    }
    

    public List<Flight> findFlightsWithParams(Long airlineCompanyId, String flightClass, int numberOfSeats, Long departureAirportId, Long arrivalAirportId) {
        
            return em.createNamedQuery("SELECT f from Flight f inner join f.travelClasses t where" +
            " t.name = :flightClass " +
            "AND t.remainingSeats >= :numberOfSeats " +
            "AND f.airlineCompany.id = :airlineCompanyId " +
            "AND f.departure.id = :departureAirportId " +
            "AND f.arrival.id = :arrivalAirportId", Flight.class)
                    .setParameter("airlineCompanyId", airlineCompanyId)
                    .setParameter("flightClass", flightClass)
                    .setParameter("numberOfSeats", numberOfSeats)
                    .setParameter("departureAirportId", departureAirportId)
                    .setParameter("arrivalAirportId", arrivalAirportId)
                    .getResultList();

    }

}
