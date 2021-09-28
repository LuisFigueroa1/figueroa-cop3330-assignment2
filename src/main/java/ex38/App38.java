package ex38;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.*;

public class App38 {

    //main function
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: "); //asks for the input
        String nList = scan.nextLine();

        String numbers[] = nList.split(" ");

        Integer evenNumbers[] = filterEvenNumbers(numbers); //even number array

        System.out.print("The even numbers are ");

        //for loop for printing the even numbers
        for(int i=0; i<evenNumbers.length; i++){

            if(i < evenNumbers.length-1)
            {
                System.out.print(evenNumbers[i] + " ");
            }
            else
            {
                System.out.print(evenNumbers[i] + ".");
            }
        }
    }

    //function used to encapsulate the logic
    public static Integer[] filterEvenNumbers(String numbers[]) {

        //empty array
        ArrayList<Integer> list = new ArrayList<>();

        // for loop for the iteration
        for(int i=0; i<numbers.length; i++){

            int data = Integer.parseInt(numbers[i]);

            if(data % 2 == 0){ //if is even

                list.add(data); // adds the number
            }
        }

        //creates the new array
        Integer[] iArray = new Integer[list.size()];
        iArray = list.toArray(iArray);

        return iArray;
    }

}
