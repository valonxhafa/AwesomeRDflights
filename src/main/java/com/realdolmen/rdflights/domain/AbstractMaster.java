package com.realdolmen.rdflights.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


/**
 * Defines common fields used by AwesomeTogethAir Entities.
 */
@MappedSuperclass
public abstract class AbstractMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Version
    private Long version;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date update;

	public AbstractMaster() {

	}
	
	//-------------------------------------------//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getUpdate() {
		return update;
	}


	public void setUpdate(Date update) {
		this.update = update;
	}    
}
