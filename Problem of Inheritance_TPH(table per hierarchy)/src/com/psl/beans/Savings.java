package com.psl.beans;

public class Savings extends Account{
	public Savings(Integer accNo, Double balance, Integer interestRate) {
		super(accNo, balance);
		this.interestRate = interestRate;
	}

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(Integer accNo, Double balance) {
		super(accNo, balance);
		// TODO Auto-generated constructor stub
	}

	private Integer interestRate;

	public Integer getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
	}
}
