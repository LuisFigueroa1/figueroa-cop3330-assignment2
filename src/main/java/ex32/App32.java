package ex32;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner;

public class App32

{

        //main
        public static void main(String[] args) {

            System.out.println("Let's play Guess the Number!");

            int correctAnswer;
            
            correctAnswer = (int) (Math.random() * 999 + 1);

            Scanner scan = new Scanner(System.in);

            int input;
            int guessNumber=0;
            int value;

            while(true){ //while loop to keep going until correct

                guessNumber=0;

                System.out.print("Enter the difficulty level(1, 2, or  3): ");
                value=scan.nextInt();

                //get the difficulty and proceed to generate a random value
                if(value==1){
                    correctAnswer = (int) (Math.random() * 10 + 1);}

                else if(value==2){
                    correctAnswer = (int) (Math.random() * 100 + 1);}

                else {
                    correctAnswer = (int) (Math.random() * 1000 + 1);}

                System.out.print("I have my number. What's your guess?: ");


                do{ //do-while loop
                    while (!scan.hasNextInt()) { //avoids non-numeric characters
                        String inputS = scan.next();
                        System.out.printf("\"%s\" is not a valid, it has to be a number.\n", inputS);}

                    input = scan.nextInt();
                    guessNumber++;  //counter of the amount of tries

                    if (input == correctAnswer){
                        System.out.println("You got it in "+guessNumber+"  guesses!");
                    }
                    //if is lower than the answer
                    else if (input < correctAnswer)
                        System.out.println("Too low. Guess again: ");
                   //if is higher than the answer
                    else if (input > correctAnswer)
                        System.out.println("Too high. Guess again: ");

                }while (input != correctAnswer);

                //pdo you want to keep playing
                System.out.print("\nDo you wish to play again (Y/N)?  ");
                char c=scan.next().charAt(0);
                if(c=='N' || c=='n') //if is n capital or not breaks anyways
                    break;
            }

        }
}