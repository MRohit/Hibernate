package com.psl.beans;

import java.util.*;


public class Vehicle  {
	public Vehicle(int vehicleId, String make) {
		super();
		this.vehicleId = vehicleId;
		this.make = make;
		
	}
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int vehicleId;
	private String make;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
}
