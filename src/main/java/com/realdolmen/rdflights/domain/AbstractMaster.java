package com.realdolmen.rdflights.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * Defines common fields used by AwesomeTogethAir Entities.
 */
@MappedSuperclass
public abstract class AbstractMaster implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Version
    private Long version;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

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
		return updateTime;
	}


	public void setUpdate(Date updateTime) {
		this.updateTime = updateTime;
	}    
}
