package com.javafundamentals;
import java.util.*;

public class Palindrome {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String org;
		String rev = "";
		System.out.print("Enter a String   : ");
		org = sc.next();
		int length = org.length();
		for(int i=length-1; i>=0; i--) {
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev)) {
				System.out.printf("%s is a Palindrome",org);
		}else {
				System.out.printf("%s is a Palindrome",org);
		}
		}
	}
