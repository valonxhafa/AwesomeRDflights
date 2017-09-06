package com.realdolmen.rdflights.domain;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
public class EmployeeOverride extends AbstractMaster {
	
	private BigDecimal overridePrice;

	public EmployeeOverride() {
		super();
	}

	public BigDecimal getDiscountPerc() {
		return overridePrice;
	}

	public void setDiscountPerc(BigDecimal overridePrice) {
		this.overridePrice = overridePrice;
	}	
}
