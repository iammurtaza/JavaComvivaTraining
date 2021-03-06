package com.comviva.day3;

import java.io.Serializable;

public class Devices implements Serializable {
	private int dId;
	private String dName;
	private double Price;
	
	@Override
	public String toString() {
		return "Devices [dId=" + dId + ", dName=" + dName + ", Price=" + Price
				+ "]";
	}
	public Devices() {}
	public Devices(int dId, String dName, double price) {
		super();
		
		this.dId = dId;
		this.dName = dName;
		Price = price;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}
