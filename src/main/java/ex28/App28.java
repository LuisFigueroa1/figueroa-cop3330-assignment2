package ex28;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.*;
import java.lang.*;

public class App28
{
    //main function
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int total = 0, counter = 1, num;

        //while loop for numbers scanned ar less than 5 numbers it keeps going
        while(counter <6){

            System.out.print("Enter the value: "); //prompts to put the number
            num =scan.nextInt();
            total += num; //calculates the total
            counter++;
        }
        System.out.print("The total is " + total + "."); //prints the total
    }
}