package com.psl.beans;

public class Vehicle {
	public Vehicle(String name, String vehicleNo) {
		super();
		this.name = name;
		this.vehicleNo = vehicleNo;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String vehicleNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
}
