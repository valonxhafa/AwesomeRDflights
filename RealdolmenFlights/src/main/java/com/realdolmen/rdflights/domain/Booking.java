package com.realdolmen.rdflights.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.realdolmen.rdflights.payment.Payment;

@Entity
public class Booking extends AbstractMaster{
	
	@NotNull
	private BigDecimal bulkDiscount;
	@OneToOne
	private Payment payment;
	@Temporal(TemporalType.TIMESTAMP)
	private Date bookingDateTime;
	
    @ManyToOne
    @NotNull
    private User customer;
	
	
	public Booking() {
		super();
	}


	public BigDecimal getBulkDiscount() {
		return bulkDiscount;
	}


	public void setBulkDiscount(BigDecimal bulkDiscount) {
		this.bulkDiscount = bulkDiscount;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	public Date getBookingDateTime() {
		return bookingDateTime;
	}


	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	
	//--------------------------------------------------//
	
	
	
	
}
