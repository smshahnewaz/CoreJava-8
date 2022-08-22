package com.javafundamentals;
import java.util.*;
class BankAccount{
	static Scanner sc= new Scanner(System.in);
	static String acName; 
	static long acNum; 
	static long acBalance;
	
	BankAccount(String acName, long acNum, long acBalance){
		this.acBalance=acBalance;
		this.acName=acName;
		this.acNum=acNum;
	}
	static void display() {
		System.out.println("       \n ### Welcome To Chase ATM ###\n");
		System.out.println("Account Name    : "+acName);
		System.out.println("Account Number  : "+acNum);
		System.out.println("Account Balance : "+acBalance);
	}
	public void deposit() {
		System.out.println("Enter Deposit Amount   :");
		long deposit=sc.nextLong();
		System.out.println("Amount Deposited :"+deposit);
	}
}
public class ATM {
	public static void main(String[] args) {
		BankAccount obj=new BankAccount("safri", 54321, 1200);
		obj.display();
		BankAccount obj1=new BankAccount("Shahnewaz", 54321, 800);
		obj1.display();
		BankAccount obj2=new BankAccount("Nitish", 5432, 8100);
		obj2.display();
		BankAccount obj3=new BankAccount("Rana", 54321, 1100);
		obj3.display();

	}
}
