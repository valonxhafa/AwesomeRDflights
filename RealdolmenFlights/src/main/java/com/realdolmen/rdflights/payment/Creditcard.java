package com.realdolmen.rdflights.payment;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Creditcard extends Payment {
	
	private Long number;
	private Date expireDate;
	private int csvNumber;
	
	public Creditcard() {
		super();
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public int getCsvNumber() {
		return csvNumber;
	}

	public void setCsvNumber(int csvNumber) {
		this.csvNumber = csvNumber;
	}
	
	
	
}
