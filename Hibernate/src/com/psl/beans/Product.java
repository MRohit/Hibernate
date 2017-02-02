package com.psl.beans;

import java.util.*;

public class Product {
	public Product(int srNo, String productName, float price) {
		super();
		this.srNo = srNo;
		this.productName = productName;
		this.price = price;
	}

	Integer srNo;
	String productName;
	Float price;
	private List<String> features =new ArrayList<String>();
	private Set<String> contactNo;
	private Map<Integer,String>empMap=new HashMap<Integer,String>();
	public Product(){
		
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}


	public List<String> getFeatures() {
		return features;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	public Set<String> getContactNo() {
		return contactNo;
	}

	public void setContactNo(Set<String> contactNo) {
		this.contactNo = contactNo;
	}

	public Map<Integer, String> getMap() {
		return empMap;
	}

	public void setMap(Map<Integer, String> empMap) {
		this.empMap = empMap;
	}

	public Map<Integer, String> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, String> empMap) {
		this.empMap = empMap;
	}

	
}
