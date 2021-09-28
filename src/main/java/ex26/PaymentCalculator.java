package ex26;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner;

public class PaymentCalculator {
    
    public static int calculateMonthsUntilPaidOff(double b, double i, double p) //declares the variables
    {
        //i is the daily rate = apr/365
        i = i / 365;

        //formula for calculating the months
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i));

    }

    // main function
    public static void main(String[] args) {

        //scans
        Scanner scan = new Scanner(System.in);
        double b, i, p;

        //prints and scans the balance
        System.out.print("What is your balance? ");
        b = scan.nextDouble();

        //gets APR
        System.out.print("What is the APR on the card (as a percent)? ");
        i = scan.nextDouble();
        i = i / 100;

        //gets p
        System.out.print("What is the monthly payment you can make? ");
        p = scan.nextDouble();

        //finally calculates n
        int n = calculateMonthsUntilPaidOff(b, i, p);
        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}

