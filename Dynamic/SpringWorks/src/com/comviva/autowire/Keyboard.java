package com.comviva.autowire;

public class Keyboard {
	private int noOfKeys;
	private String keyBoardType;
	private int year;

	public int getNoOfKeys() {
		return noOfKeys;
	}

	public void setNoOfKeys(int noOfKeys) {
		this.noOfKeys = noOfKeys;
	}

	public String getKeyBoardType() {
		return keyBoardType;
	}

	public void setKeyBoardType(String keyBoardType) {
		this.keyBoardType = keyBoardType;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Keyboard [noOfKeys=" + noOfKeys + ", keyBoardType="
				+ keyBoardType + ", year=" + year + "]";
	}

}
