package com.psl.beans;

public class FourWheeler extends Vehicle {
	public FourWheeler(String name, String vehicleNo, String color) {
		super(name, vehicleNo);
		this.color = color;
	}

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
