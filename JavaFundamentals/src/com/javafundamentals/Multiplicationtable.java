package com.javafundamentals;
public class Multiplicationtable {

	public static void main(String[] args) {
		int n =9;
		
		System.out.println("Multiplication Table(Ascending Order):");
		for(int i=1; i<=n; ++i) {
			System.out.println("\t\t\t\t\t\t"+n+"x"+i+"="+i*n);
			//System.out.println(i);
		}
		System.out.println("Multiplication Table(Descending Order):");
		for(int i=n; i>=1; --i) {
			System.out.println("\t\t\t\t\t\t"+n+"x"+i+"="+i*n);
			//System.out.println(i);
		}
	}

}


