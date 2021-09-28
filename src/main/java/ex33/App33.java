package ex33;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Random;
import java.util.Scanner;

public class App33 {

    public static void main(String[] args) {

        //options that can pop
        String[] options = {"Yes.","No.","Maybe.","Ask again later."};

        //randomizer
        Random ran = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your question?\n"); //prints the question

        String input = scan.nextLine(); //gets the user input

    //randomly picks the answer
        int pickAnswer = ran.nextInt(options.length);

        String answer = options[pickAnswer];

            //prints
        System.out.println("\n"+answer);//print the answer
    }
}

