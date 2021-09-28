package ex34;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class App34 {

    public static void main(String[] args) {

        //start of the array list
        ArrayList<String> employeeNames =
                new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printNames(employeeNames);//prints the list

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter an employee name to remove: \n");
        //who would be removed
        String removeName = scan.nextLine();

        //function to remove the employee selected, poor is getting fired
        employeeNames.remove(removeName);

        System.out.println();
        printNames(employeeNames);//print employeeNames
    }

    //main function
    public static void printNames(ArrayList<String> employeeNames) {
        System.out.println("There are "+employeeNames.size()+" employees: ");

        for(String employees:employeeNames)
        {
            System.out.println(employees);
        }
    }
}

