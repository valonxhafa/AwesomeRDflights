package com.realdolmen.rdflights.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket extends AbstractMaster implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne(cascade =CascadeType.ALL)
	private User passenger;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Flight flight;
	
	private BigDecimal buyPrice;
	
	private BigDecimal soldPrice;
	
	@ManyToOne
	private Booking booking;
	
//	@ManyToOne
//	private Booking booking;

	@Embedded
	private Travel travelInformation;
	
	public Ticket() {
		super();
	}

	public User getPassenger() {
		return passenger;
	}



	public void setPassenger(User passenger) {
		this.passenger = passenger;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}



	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}



	public BigDecimal getSoldPrice() {
		return soldPrice;
	}



	public void setSoldPrice(BigDecimal soldPrice) {
		this.soldPrice = soldPrice;
	}

	public Travel getTravelInformation() {
		return travelInformation;
	}

	public void setTravelInformation(Travel travelInformation) {
		this.travelInformation = travelInformation;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
}
