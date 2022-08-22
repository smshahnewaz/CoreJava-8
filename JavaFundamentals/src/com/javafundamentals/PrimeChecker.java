
//Print Prime Number Program in Java

package com.javafundamentals;
import java.util.Scanner;
public class PrimeChecker {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter   : ");
		int num = sc.nextInt();
	
		if(isPrime(num)){
			System.out.printf("%d PRIME",num);
		}else{
			System.out.printf("%d is not PRIME",num);
		}
	}
	public static boolean isPrime(int x) {
		
			while (x<=1 || x==0) {
				return false;
			}if(x==2) {
				return true;
			}else if(x%2==0) {
				return false;
			}for(int i=3; i<Math.sqrt(x);i+=2) {
				if(x%i==0)
					return false;
				}
			return true;
	}
}
 

