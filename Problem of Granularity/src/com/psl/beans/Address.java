package com.psl.beans;

public class Address {
	public Address() {
		
		// TODO Auto-generated constructor stub
	}

	public Address(String streetName, String city) {
		super();
		this.streetName = streetName;
		this.city = city;
	}

	private String streetName,city;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
