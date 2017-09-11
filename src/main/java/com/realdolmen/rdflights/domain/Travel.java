package com.realdolmen.rdflights.domain;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;



@Embeddable
public class Travel{
	
	@NotNull
	private BigDecimal basePrice;
	@NotNull
	private BigDecimal marginPrice;
	private BigDecimal finalPrice;
	@OneToOne
	private EmployeeOverride employeeOverride;
	@NotBlank
	@Size(max = 150)
	private String seatClass;

	

	
	public Travel() {
		super();
	}
	public Travel(BigDecimal bp) {
		super();
		this.basePrice = bp;
	}
	//--------------------------------------------------//
	
	public BigDecimal getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}


	public BigDecimal getMarginPrice() {
		return marginPrice;
	}


	public void setMarginPrice(BigDecimal marginPrice) {
		this.marginPrice = marginPrice;
	}


	public BigDecimal getFinalPrice() {
		return finalPrice;
	}


	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}


	public EmployeeOverride getEmployeeOverride() {
		return employeeOverride;
	}


	public void setEmployeeOverride(EmployeeOverride employeeOverride) {
		this.employeeOverride = employeeOverride;
	}


	public String getSeatClass() {
		return seatClass;
	}


	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

}
