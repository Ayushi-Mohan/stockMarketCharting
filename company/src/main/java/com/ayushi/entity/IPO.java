package com.ayushi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IPO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String cname;
	
	private float pricepershare;
	private int totalshares;
	private String opendatetime;
	private String remarks;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getPricepershare() {
		return pricepershare;
	}
	public void setPricepershare(float pricepershare) {
		this.pricepershare = pricepershare;
	}
	public int getTotalshares() {
		return totalshares;
	}
	public void setTotalshares(int totalshares) {
		this.totalshares = totalshares;
	}
	public String getOpendatetime() {
		return opendatetime;
	}
	public void setOpendatetime(String opendatetime) {
		this.opendatetime = opendatetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPO [id=" + id + ", cname=" + cname + ", pricepershare=" + pricepershare + ", totalshares="
				+ totalshares + ", opendatetime=" + opendatetime + ", remarks=" + remarks + "]";
	}
	
	
	
	
	
}
