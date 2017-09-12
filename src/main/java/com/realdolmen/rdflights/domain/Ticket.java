package com.realdolmen.rdflights.domain;

import java.math.BigDecimal;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket extends AbstractMaster {
	
	@OneToOne
	private User passenger;
	
	private BigDecimal buyPrice;
	
	private BigDecimal soldPrice;
	@ManyToOne
	private Booking booking;
	@Embedded
	private Travel travelInformation;
	@Transient
	private int local_counter;

	

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



	public Booking getBooking() {
		return booking;
	}



	public void setBooking(Booking booking) {
		this.booking = booking;
	}



	public Travel getTravelInformation() {
		return travelInformation;
	}



	public void setTravelInformation(Travel travelInformation) {
		this.travelInformation = travelInformation;
	}



	public int getLocal_counter() {
		return local_counter;
	}



	public void setLocal_counter(int local_counter) {
		this.local_counter = local_counter;
	}
	
	
	//--------------------------------------------------//
	

	
	
}
