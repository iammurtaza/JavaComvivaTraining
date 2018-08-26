package com.comviva.autowire;

public class Processor {
	private int frequency;
	private String series;
	private String company;

	@Override
	public String toString() {
		return "Processor [frequency=" + frequency + ", series=" + series
				+ ", company=" + company + "]";
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
