package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.*;

public class App {

    public static void passwordValidator(String userPrompt)
    {
        // checks for the length of the userPrompt
        int length  = userPrompt.length();

        // boolean to check for the cases
        boolean lowCase = false, upCase = false, nums = false, special = false;

        //list of special characters that are included
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('%', '^' , '*' , '(' , ')' , '!' , '@' , '&' , '#' , '$' , '-' , '+'));

        for (char i : userPrompt.toCharArray()) //for loop for find out what kind of password is it
        {
            if (Character.isLowerCase(i)) //if the lower case requirement is met
                lowCase = true;
            if (Character.isUpperCase(i)) //if the upper case requirement is met
                upCase = true;
            if (Character.isDigit(i)) //if the number requirement is met
                nums = true;
            if (set.contains(i)) //if the special character requirement is met
                special = true;
        }


        if (nums && lowCase && special //very strong case
                && (length  >= 8) || nums && upCase && special
                && (length  >= 8))
            System.out.println("Very Strong");
        
        else if ((lowCase || upCase || special) //strong case
                && (length  >= 8))
            System.out.println("Strong");
        
        else if(lowCase && (length  < 8)|| upCase && (length  < 8)) //weak case
            System.out.print("Weak");
        
        else
            System.out.print("Very Weak"); //very weak case

    }

    //main
    public static void main(String[] args)
    {
        String userPrompt;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Password: "); //prompt
        
        userPrompt=scan.nextLine();
        passwordValidator(userPrompt);
    }


}



