package com.realdolmen.rdflights.payment;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.realdolmen.rdflights.domain.AbstractMaster;
import com.realdolmen.rdflights.domain.Booking;


@Entity
public class Payment extends AbstractMaster {
	
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus status;
	@OneToOne
	private Booking booking;
	@NotNull
	private boolean availability;
	
	public Payment() {
		super();
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

}
