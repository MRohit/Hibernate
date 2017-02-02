package com.psl.beans;

public class Vehicle {
	public Vehicle(String vname, String vehicleNo) {
		super();
		this.vname = vname;
		this.vehicleNo = vehicleNo;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	private String vname;
	private String vehicleNo;
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
}
