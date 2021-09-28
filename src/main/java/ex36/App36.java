package ex36;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App36 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //array list is created
        ArrayList<Integer> data = new ArrayList<Integer>();
        String input = null;

        //if the input is not "done" take the input
        do {
            System.out.print("Enter a number: ");
            input = scan.next();

            //if is not "done" keep going
            if(!input.equals("done")) {

                //try-catch for making it into an integer
                try {
                    int value = Integer.parseInt(input);
                    data.add(value);
                }
                catch(NumberFormatException nfe) {

                }
            }
        }
        //while loop that keeps going as long the user doesn't input "done"
        while(!input.equals("done"));

        System.out.println("The average is "+ average(data)); //average
        System.out.println("The minimum is "+ min(data)); //minimum
        System.out.println("The maximum is "+ max(data)); //maximum
        System.out.println("The standard deviation is "+ String.format("%.2f", std(data))); //standard deviation


    }

//find average function
    public static double average(ArrayList<Integer> data) {
        int total = 0;
        for(int value: data) {
            total += value;
        }
        double mean = (double)(total)/data.size();
        return mean;
    }

//find minimum function
    public static int min(ArrayList<Integer> data) {
        int min= data.get(0);

        for(int value: data) {
            if(value < min)
                min = value;
        }

        return min;
    }

//find maximum function
    public static int max(ArrayList<Integer> data) {
        int max= data.get(0);

        for(int value: data) {
            if(value > max)
                max = value;
        }

        return max;
    }

 //find standard deviation function
    public static double std(ArrayList<Integer> data) {
        double mean = average(data);

        double sum = 0;
        for(int value: data) {
            sum = sum + Math.pow((value-mean), 2);
        }
        double standardDev = Math.sqrt(sum/data.size());

        return standardDev;
    }

}

