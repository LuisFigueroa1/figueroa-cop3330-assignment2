package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.*;

public class App
{
    static boolean isAnagram(String promptA, String promptB) {

        String A = promptA.replaceAll("\\s", "");
        String B = promptB.replaceAll("\\s", "");

        boolean check = true; //boolean for the function

        if (A.length() != B.length()) { //checks for differences in the prompts
            check = false;
        }

        else { // checks for similarities
            char[] ArrayA = A.toLowerCase().toCharArray();
            char[] ArrayB = B.toLowerCase().toCharArray();

            Arrays.sort(ArrayA); //sorts array A
            Arrays.sort(ArrayB); //sorts array B
            check = Arrays.equals(ArrayA, ArrayB); // checks for anagram
        }

        if (check) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams: \n");
        System.out.print("Enter the first string: ");
        String promptA=scan.nextLine();

        System.out.print("Enter the second string: ");
        String promptB=scan.nextLine();

        if(isAnagram(promptA,promptB)) { //prints if they are an anagram
            System.out.print("\"" + promptA + "\"" + " and " + "\"" + promptB + "\"" + " are anagrams\n");
        }

        else { // prints if they are not an anagram
            System.out.print("\"" + promptA + "\"" + " and " + "\"" + promptB + "\"" + " are not anagrams\n");
        }

    }
}
