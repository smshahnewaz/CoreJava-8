package com.javafundamentals;
 class Animal{
	 void show() {
		 System.out.println("Parent Method");
	 }
}
class Horse extends Animal{
	Horse(){
		System.out.println("Horse constructor!Walks with 4 legs!");
	}
	void show()  {
		System.out.println("Child class B show mehtod!");
	}
}
class Chicken extends Animal{
	Chicken(){
		System.out.println("Walks with 2 legs only!");
	}
	void show() {
		System.out.println("I am a show constructor!");
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		Animal a=new Horse();
		a.show();
		System.out.println("\n");
		Animal a1 = new Chicken();
		a1.show();
	}
}







