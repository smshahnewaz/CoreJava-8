package com.javafundamentals;
import java.util.Scanner;
public class PrimeBetweenRange {
         static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         System.out.print("Enter Start  : ");
         int min = sc.nextInt();
        
         System.out.print("Enter Start  : ");
         int max = sc.nextInt();
   
        //find all prime numbers in the given range
         System.out.printf("\n Prime Number(s) between %d to %d  \n",min, max);
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.print(n+" ");
                }}}
    public static boolean isPrime(int num) { 
         if(num ==1 || num==0) {
                   return false;
         }else if(num==2) {
                   return true;
         }else if(num%2==0) {
                   return false; 
         }
        for(int i = 3; i <=Math.sqrt(num); i+=2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
