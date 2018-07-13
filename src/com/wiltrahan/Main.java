package com.wiltrahan;

public class Main {

	public static void main(String[] args) {
		
		
		CheckingAccount wilCheck = new CheckingAccount("555checking", 1000.00, 3.00);
		BankAccount wilBank = new BankAccount(wilCheck, "Wil Dough", "wil@us.gov", "672-0909", "Providence");

		
		System.out.println("Before Checking Deposit " + wilBank.getCheckingAcct().getChkAcctBal());


		wilBank.chkTransQ(wilBank.getCheckingAcct(), 500.00, "deposit");
		wilBank.chkTransQ(wilBank.getCheckingAcct(), 200.00, "deposit");
		wilBank.chkTransQ(wilBank.getCheckingAcct(), 150.00, "deposit");
		
		wilBank.chkTransQ(wilBank.getCheckingAcct(), 350.00, "withdraw");

		System.out.println("After Checking Deposit " + wilBank.getCheckingAcct().getChkAcctBal());
		
		
		SavingsAccount wilSave = new SavingsAccount("111Savings", 5000.00, 12.00);
		
		wilBank = new BankAccount(wilSave, "Wil Dough", "wil@us.gov", "672-0900", "Providence");
		System.out.println("Before Savings Deposit " + wilBank.getSavingsAcct().getSavAcctBal());
		
		wilBank.savTransQ(wilBank.getSavingsAcct(), 550.00, "deposit");
		
		System.out.println("After Savings Deposit " + wilBank.getSavingsAcct().getSavAcctBal());		
	}

}
