package com.wiltrahan;

public class Transaction {
	
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	private double amount;
	private String type;
	
	
	public Transaction(CheckingAccount checkingAccount, double amount, String type) {
		this.checkingAccount = checkingAccount;
		this.amount = amount;
		this.type = type;
		
		if(this.type == "deposit") {
			deposit(this.checkingAccount, this.amount);
		} else {
			withdraw(this.checkingAccount, this.amount);
		}
	}
	
	public Transaction(SavingsAccount savingsAccount, double amount, String type) {
		this.savingsAccount = savingsAccount;
		this.amount = amount;
		this.type = type;
		
		if(this.type == "deposit") {
			deposit(this.savingsAccount, this.amount);
		} else {
			withdraw(this.savingsAccount, this.amount);
		}
	}

	public void deposit(CheckingAccount checkingAccount, double amount) {
		double balance = checkingAccount.getChkAcctBal() + amount;
		checkingAccount.setChkAcctBal(balance);
	}
	
	public void deposit(SavingsAccount savingsAccount, double amount) {
		double balance = savingsAccount.getSavAcctBal() + amount;
		savingsAccount.setSavAcctBal(balance);
	}
	
	public void withdraw(CheckingAccount checkingAccount, double amount) {
		double balance = checkingAccount.getChkAcctBal() - amount;
		checkingAccount.setChkAcctBal(balance);
	}
	
	public void withdraw(SavingsAccount savingsAccount, double amount) {
		double balance = savingsAccount.getSavAcctBal() - amount;
		savingsAccount.setSavAcctBal(balance);
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
