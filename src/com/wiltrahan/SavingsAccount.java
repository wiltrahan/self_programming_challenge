package com.wiltrahan;

public class SavingsAccount {
	
	private String savAcctNum;
	private double savAcctBal;
	private double rate;
	
	public SavingsAccount(String savAcctNum, double savAcctBal, double rate) {
		this.savAcctNum = savAcctNum;
		this.savAcctBal = savAcctBal;
		this.rate = rate;
	}

	public double getSavAcctBal() {
		return savAcctBal;
	}

	public void setSavAcctBal(double savAcctBal) {
		this.savAcctBal = savAcctBal;
	}

	public String getSavAcctNum() {
		return savAcctNum;
	}

	public double getRate() {
		return rate;
	}
	

}
