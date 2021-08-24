package com.ayushi.import_excel.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockPrice {

	@Id
	private long ccode;
	
	
	private String stockex;
	private float ppshare;
	private Date date;
	private String time;
	
	public StockPrice() {}
	
	public StockPrice(long ccode, String stockex, float ppshare, Date date, String time) {
		super();
		this.ccode = ccode;
		this.stockex = stockex;
		this.ppshare = ppshare;
		this.date = date;
		this.time = time;
	}

	public long getCcode() {
		return ccode;
	}

	public void setCcode(long ccode) {
		this.ccode = ccode;
	}

	public String getStockex() {
		return stockex;
	}

	public void setStockex(String stockex) {
		this.stockex = stockex;
	}

	public float getPpshare() {
		return ppshare;
	}

	public void setPpshare(float ppshare) {
		this.ppshare = ppshare;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "StockPrice [ccode=" + ccode + ", stockex=" + stockex + ", ppshare=" + ppshare + ", date=" + date
				+ ", time=" + time + "]";
	}
	
	
	
}
