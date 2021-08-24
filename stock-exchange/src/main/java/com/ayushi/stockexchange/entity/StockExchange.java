package com.ayushi.stockexchange.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StockExchanges")
public class StockExchange {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="StockExchange")
	private String name;
	
	@Column(name="Description")
	private String desc;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Remarks")
	private String remarks;
	
	public StockExchange() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", name=" + name + ", desc=" + desc + ", address=" + address
				+ ", remarks=" + remarks + "]";
	}
	
}
