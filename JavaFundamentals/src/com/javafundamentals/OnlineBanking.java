package com.javafundamentals;

class BankAccount{
	static double balance=1345.9;
	BankAccount(){
		System.out.println(balance);
	}
	void diplayBalance() {
		System.out.println(balance);
	}
}
class CehckingAccount extends BankAccount{
	CehckingAccount(){
		super();
		System.out.println("================\n");
		super.diplayBalance();
	}
}
public class OnlineBanking {
	public static void main(String[] args) {
		
		BankAccount b2= new CehckingAccount();
		b2.diplayBalance();
	
		
	
		
	}
}
