package com.javafundamentals;
import java.util.*;
class Account{
	
	long Account_number;
	String name; 
	double balance;
	Account(){
		this.Account_number=Account_number;
		this.name=name;
		this.balance=balance;
	}
	// deposit method
	public static void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount  :");
		int amount=sc.nextInt();
		System.out.println("Amount Deposited  :"+amount);
	}
}
public class BankingApp {

	public static void main(String[] args) {
		System.out.println("#### Welcome To CHASE ATM ####\n");

		Account a=new Account();
		a.Account_number=381563887;
		a.balance=5000.66;
		a.name="Johnn Smith";
		System.out.println("Account Holer     : "+a.name);
		System.out.println("Account NUmber    : "+a.Account_number);
		System.out.println("Available Balance : $"+a.balance);
		
		Account.deposit();

	}
	

	
}
