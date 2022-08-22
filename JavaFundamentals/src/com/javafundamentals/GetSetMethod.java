package com.javafundamentals;
class Beast{
	private String name;
	private int age;
	// getter method
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	//setter method
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
}
public class GetSetMethod{
	public static void main(String[] args) {
		Beast a=new Beast();
		a.setName("Lion");
		a.setAge(12);
		System.out.println("The private data tyope has been retrieved\n");
		System.out.println("Name   :"+a.getName());
		System.out.println("Age    :"+a.getAge());
	}
}


