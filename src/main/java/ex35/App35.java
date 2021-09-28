package ex35;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App35 {

    public static void main(String[] args) {

        //scan for user prompt
        Scanner scan = new Scanner(System.in);

        String participant = null;

        //creates the arraylist
        ArrayList<String> list = new ArrayList<String>();

        //loop to take in entries
        do {
            System.out.print("Enter a participant:");
            participant= scan.nextLine();

            //if condition to have the participant adding entries
            if(!participant.isEmpty())
                list.add(participant);

            //while loop to stop when empty
        }while(!participant.isEmpty());

        //random number generator
        Random rand = new Random();
        int randP = rand.nextInt(list.size());

        //results!
        System.out.print("The winner is... " + list.get(randP) + ".");

    }

}

