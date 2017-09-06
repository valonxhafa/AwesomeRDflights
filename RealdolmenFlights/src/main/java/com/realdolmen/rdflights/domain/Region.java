package com.realdolmen.rdflights.domain;

import javax.persistence.Entity;

@Entity
public class Region extends AbstractMaster {

	private String regionName;

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	
	
	
	
}
