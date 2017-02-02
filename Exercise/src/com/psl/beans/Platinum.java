package com.psl.beans;

import java.util.List;

public class Platinum extends User{
	public Platinum(int id, String name, List<Address> address, Vehicle vehicle,
			String validity) {
		super(id, name, address, vehicle);
		this.validity = validity;
	}

	public Platinum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Platinum(int id, String name, List<Address> address, Vehicle vehicle) {
		super(id, name, address, vehicle);
		// TODO Auto-generated constructor stub
	}

	private String validity;

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}
}
