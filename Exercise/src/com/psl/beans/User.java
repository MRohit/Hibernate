package com.psl.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {
	public User(int id, String name, List<Address> address2, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.address = address2;
		this.vehicle = vehicle;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private List<Address> address=new ArrayList<Address>();
	private Vehicle vehicle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
