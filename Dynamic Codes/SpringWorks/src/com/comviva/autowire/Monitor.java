package com.comviva.autowire;

public class Monitor {
	private int screenWidth;
	private String companyName;
	private String type;

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Monitor [screenWidth=" + screenWidth + ", companyName="
				+ companyName + ", type=" + type + "]";
	}
}
