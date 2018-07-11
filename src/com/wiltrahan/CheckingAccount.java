package com.wiltrahan;

public class CheckingAccount {

	private String chkAcctNum;
	private double chkAcctBal;
	private double servFee;
	
	public CheckingAccount(String chkAcctNum, double chkAcctBal, double servFee) {
		this.chkAcctNum = chkAcctNum;
		this.chkAcctBal = chkAcctBal;
		this.servFee = servFee;
	}

	public double getChkAcctBal() {
		return chkAcctBal;
	}

	public void setChkAcctBal(double chkAcctBal) {
		this.chkAcctBal = chkAcctBal;
	}

	public String getChkAcctNum() {
		return chkAcctNum;
	}

	public double getServFee() {
		return servFee;
	}
	
}
