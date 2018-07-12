package com.wiltrahan;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	
	private CheckingAccount checkingAcct;
	private SavingsAccount savingsAcct;
	
	private Transaction transaction;
	
	private String name;
	private String email;
	private String phone;
	private String branch;
	
	
	
	public BankAccount(CheckingAccount checkingAcct, String name, String email, String phone, String branch) {
		this.checkingAcct = checkingAcct;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.branch = branch;
	}
	
	public BankAccount(SavingsAccount savingsAcct, String name, String email, String phone, String branch) {
		this.savingsAcct = savingsAcct;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.branch = branch;
	}

	public CheckingAccount getCheckingAcct() {
		return checkingAcct;
	}

	public void setCheckingAcct(CheckingAccount checkingAcct) {
		this.checkingAcct = checkingAcct;
	}

	public SavingsAccount getSavingsAcct() {
		return savingsAcct;
	}

	public void setSavingsAcct(SavingsAccount savingsAcct) {
		this.savingsAcct = savingsAcct;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}
	
	
	public void checkingTransQ(List<Transaction> trans) {
		
		for(Transaction t: trans) {
			System.out.println(t.getCheckingAccount() + " " + t.getAmount());

			transaction.deposit(t.getCheckingAccount(), t.getAmount());
		}

	}
	
	public void transQ(CheckingAccount checkingAccount, double amount, String type) {
		List<Transaction> trans = new ArrayList<>();
		Transaction transaction = new Transaction(checkingAccount, amount, type);
		trans.add(transaction);
		
		for(Transaction t: trans) {
			System.out.println(t.getAmount());
			transaction.deposit(t.getCheckingAccount(), t.getAmount());
		}
		
		//return trans;
	}
	
//	public void savingsTransQ(SavingsAccount savingsAccount, String type, double amount) {
//		
//		trans.add(new Transaction(savingsAccount, amount, type));
//		
//		System.out.println(trans.size());
//
//	}
	
}
