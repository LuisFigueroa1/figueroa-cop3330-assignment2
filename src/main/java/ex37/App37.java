package ex37;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.*;

public class App37 {

    //main
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        //user input for length
        System.out.print("What's the minimum length? ");
        //converts int
        int lengthA = Integer.parseInt(scan.nextLine());

        //asks how many numbers should be present in the password
        System.out.print("How many special characters? ");
        //converts int
        int special = Integer.parseInt(scan.nextLine());

        //how many number values should be in the password
        System.out.print("How many numbers? ");
        //converts int
        int numericV = Integer.parseInt(scan.nextLine());
        
        //prints the password
        System.out.println("Your password is " + passwordGenerator(lengthA, special, numericV));
    }

    //function to generate the password
    public static String passwordGenerator(int lengthB, int special, int numericVa)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; //letter list
        
        String specialCharacters = "!@#$%^&*"; //list of special characters
        
        String numericV = "1234567890"; //numeric values list
        
        Random rand = new Random(); 

        //arraylist
        ArrayList<Character> characters = new ArrayList<>();

        //for loop for the special characters
        for(int i=0; i<special; i++)
        {
            characters.add(specialCharacters.charAt(rand.nextInt(specialCharacters.length())));
        }

        //for loop for the numeric values
        for(int i=0; i<numericVa; i++)
        {
            characters.add(numericV.charAt(rand.nextInt(numericV.length())));
        }

        //for loop for the length
        for(int i=characters.size()-1; i<lengthB; i++)
        {
            characters.add(letters.charAt(rand.nextInt(letters.length())));
        }

        Collections.shuffle(characters); //moves the elements around

        String passW = "";

        //for loop for merging all the elements
        for(Character s : characters)
        {
            passW += Character.toString(s);
        }

        return passW;
    }
}
