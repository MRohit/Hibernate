package com.psl.beans;

import java.io.Serializable;

public class EmpPK implements Serializable{
	private static final long serialVersionId=1;
	public EmpPK(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public EmpPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	int empId;
	String name;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
