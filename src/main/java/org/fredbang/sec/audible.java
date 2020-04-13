package org.fredbang.sec;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener; 
import static javax.persistence.TemporalType.TIMESTAMP;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract  class audible<U> {
	
	@CreatedBy
	protected U createdby;
	
	@CreatedDate
	protected U createddate;
	@LastModifiedBy
	protected U lastmodifiedby;
	@LastModifiedDate
	@Temporal(TIMESTAMP)
	private Date lastmodifieddate;
	
	
	public U getCreatedby() {
		return createdby;
	}
	
	public void setCreatedby(U createdby) {
		this.createdby = createdby;
	}
	public U getCreateddate() {
		return createddate;
	}
	
	public void setCreateddate(U createddate) {
		this.createddate = createddate;
	}
	
	public U getLastmodifiedby() {
		return lastmodifiedby;
	}
	
	public void setLastmodifiedby(U lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}
	
	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}
	
	
	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}
	
	
	

}
