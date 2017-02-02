package com.psl.beans;

public class Current extends Account{
	public Current(Integer accNo, Double balance, Double minBalance) {
		super(accNo, balance);
		this.minBalance = minBalance;
	}

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(Integer accNo, Double balance) {
		super(accNo, balance);
		// TODO Auto-generated constructor stub
	}

	private Double minBalance;

	public Double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(Double minBalance) {
		this.minBalance = minBalance;
	}
}
