package com.psl.beans;

import java.util.List;

public class Titanium extends User{
	public Titanium(int id, String name, List<Address> address, Vehicle vehicle,
			String type2) {
		super(id, name, address, vehicle);
		this.type2 = type2;
	}

	public Titanium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Titanium(int id, String name, List<Address> address, Vehicle vehicle) {
		super(id, name, address, vehicle);
		// TODO Auto-generated constructor stub
	}

	private String type2;

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}
}
