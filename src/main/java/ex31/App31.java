package ex31;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.*;
import java.lang.*;

public class App31 {

    public static void main (String[] args)
    {
        int restP;
        int age;
        //scanner utility
        Scanner scan=new Scanner(System.in);

        System.out.print("Resting Pulse: ");
        restP = scan.nextInt();

        System.out.print("Age: ");
        age = scan.nextInt();

        int intensity = 55; //header
        System.out.println("Intensity | Rate\n" + "--------------------");

        while(intensity<96){ //while loop to print the rates

            double Target = (((220 - age) - restP) * (intensity*0.01)) + restP; //formula
            //formatting
            System.out.println(intensity+"%       | "+ Math.round(Target) +" bpm");
            intensity+=5; //adds 5 to the intensity
        }
    }

}
