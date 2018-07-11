package com.wiltrahan;

public class Transaction {
	
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

}
