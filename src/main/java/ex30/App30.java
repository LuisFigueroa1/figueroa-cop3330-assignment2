package ex30;

/*
 *  UCF COP3330 Fall 2021 assignment 02 Solution
 *  Copyright 2021 Luis Figueroa
 */

public class App30 {
    public static void main(String[] args)
    {
        //first for loop for the i axis
        for(int i=1;i<=12;i++)
        {
            //second nested loop for the j axis
            for(int j=1;j<=12;j++)
            {
                int mult = i*j;
                 if(mult < 10){
                 System.out.print((mult)+"   ");}
                 //replaces the tab character
                 if (mult > 9) {
                     if (mult < 100) {
                         System.out.print((mult) + "  ");
                     }
                 }
                 if(mult > 99)
                 {
                     System.out.print((mult) + " ");
                 }
            }
            System.out.println();
        }
    }
}
