package com.psl.beans;

import javax.persistence.*;

@Table(name="cust")
@Entity
public class Customer {
	public Customer(int custId, String name) {
		super();
		this.custId = custId;
		this.name = name;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	private int custId;
	
	
	private String name;


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
