package ex29;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.*;
import java.lang.*;

public class App29
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);


        int value;

        System.out.print("What is the rate of return? ");

        do{
            while (!scan.hasNextInt()) { //avoids non-numeric characters
                String inputS = scan.next();
                System.out.printf("Sorry this is not a valid input\nWhat is the rate of return? ");}

            value = scan.nextInt();

            if(value>=1 && value<=72) { //if is a valid number
                System.out.print("it will take " + (72 / value) + " year to double your initial investment");
                break;
            }

            else// if is 0
            {
                System.out.println("Sorry this is not a valid input\nWhat is the rate of return? ");
            }

        }while(true);
    }
}
