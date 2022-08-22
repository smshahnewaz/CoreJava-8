package com.javafundamentals;
import java.util.Scanner;
public class CurrencyExchanger {
private static Scanner key = new Scanner(System.in);
public static void main(String[] args) {
    // TODO Auto-generated method stub

    double exchangeRate = 0;
    int conversion;
    double dollar = 0;
    double yuan = 0;
    String Dollar = " ";
    int quarter = 0;


    System.out.print("Enter the exchange rate from dollars to RMB: ");
    exchangeRate = key.nextDouble();

    System.out.print("Enter 0 to convert dollars to RMB or "
            + " 1 for RMB to dollars: ");
    conversion = key.nextInt();


    //while(conversion == 0 || conversion == 1) {
    if(conversion == 0) {
        System.out.print("Enter the dollar amount: ");
        dollar = key.nextDouble();
        yuan = dollar * exchangeRate;

        System.out.println("$" + dollar + " is " + yuan + " yuan.");
        System.out.println();

    }else if(conversion == 1) {
        System.out.print("Enter the Yuan amount: ");
        yuan = key.nextDouble();
        dollar = yuan / exchangeRate;

        System.out.printf(yuan + " yuan is%8.3f dollars.", dollar);
        System.out.println();

        Dollar = dollar + "";
        System.out.println(Dollar.substring(0, Dollar.indexOf(".")) + " dollars");
    }

}

}