package com.wiltrahan;

public class Main {

	public static void main(String[] args) {
		
		
		CheckingAccount wilCheck = new CheckingAccount("555checking", 1000.00, 3.00);
		
		BankAccount wilBank = new BankAccount(wilCheck, "Wil Dough", "wil@us.gov", "672-0909", "Providence");
		
		System.out.println(wilBank.getCheckingAcct().getChkAcctBal());
		
		Transaction transaction = new Transaction();
		
		transaction.deposit(wilBank.getCheckingAcct(), 900.00);
		
		System.out.println(wilBank.getCheckingAcct().getChkAcctBal());
	}

}
