package com.javafundamentals;
public class Account {
	private String name;
	private long ssn;
	private String password;
	//getter & setter
	
	public String getname() {
		return this.name;
	}
	public String getpasword() {
		return this.password;
	}
	public long getssn() {
		return this.ssn;
	}
	// setter method
	void setname(String name) {
		this.name=name;
	}
	void setpassword(String password) {
		this.password=password;
	}
	void setssn(long ssn) {
		this.ssn=ssn;
	}
	public static void main(String[] args) {
		Account a=new Account();		
		a.setname("John Smith");
		a.setssn(172594434);
		a.setpassword("jsmith");
		System.out.println("Name     :"+a.getname());
		System.out.println("SSN      :"+a.getssn());
		System.out.println("Password :"+a.getpasword());
	}
}






