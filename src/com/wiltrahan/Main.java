package com.wiltrahan;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		CheckingAccount wilCheck = new CheckingAccount("555checking", 1000.00, 3.00);
		
		BankAccount wilBank = new BankAccount(wilCheck, "Wil Dough", "wil@us.gov", "672-0909", "Providence");

		
		System.out.println(wilBank.getCheckingAcct().getChkAcctBal());
		
		ArrayList<Transaction> toTheQ = new ArrayList<Transaction>();
		
		toTheQ.add(new Transaction(wilBank.getCheckingAcct(), 50.00, "deposit"));
		toTheQ.add(new Transaction(wilBank.getCheckingAcct(), 150.00, "deposit"));
		toTheQ.add(new Transaction(wilBank.getCheckingAcct(), 200.00, "deposit"));
		
		wilBank.checkingTransQ(toTheQ);
		
	}

}
