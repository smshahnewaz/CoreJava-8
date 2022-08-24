// Java Program to print 100 to 0 backward with 5 differences 

package com.javafundamentals;

public class DescendignLoop {
		// main method of the class 
	 public static void main(String[] args) {
		 // Driver Code 
		 System.out.println("=====Looping 100 to 0 backward====");
		 for(int i =100; i>=0; i=i-5) {
				System.out.print(i+" ");
			}
		 
		 System.out.println("\n\n=====Looping 0 to 100 onward====");
		 for(int i=0; i<=100;i+=5) {
			 System.out.print(i+" ");
		 }
	}
}
