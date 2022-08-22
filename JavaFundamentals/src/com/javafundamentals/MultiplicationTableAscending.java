package com.javafundamentals;
import java.util.*;
public class MultiplicationTableAscending {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Num   : " );
		int n = sc.nextInt();
		System.out.printf("Multiplication Table of %d as follows  :\n",n );
		for(int i =1; i<=15; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
