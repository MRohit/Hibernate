package com.psl.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {
	public User(int id, String name, List<String> address, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.vehicle = vehicle;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private List<String> address=new ArrayList<String>();
	private Set<String> contactNo;
;
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
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
