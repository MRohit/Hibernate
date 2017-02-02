package com.psl.beans;

public class Address {
	public Address(String city, String add) {
		super();
		this.city = city;
		this.add = add;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	String city;
	String add;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
}
