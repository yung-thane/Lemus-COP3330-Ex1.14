/*
 *  UCF COP3330 Fall 2021 Assignment 1.14 Solution
 *  Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class Tax_Calculator {
    public static void main(String [] arg){

        System.out.print("What is the order amount? ");
        Scanner orderInp = new Scanner(System.in);
        double orderAmt = orderInp.nextDouble();

        System.out.print("What is the state? ");
        Scanner stateInp = new Scanner(System.in);
        String state = stateInp.nextLine();

        System.out.printf("The subtotal is $%.2f.\n", orderAmt);

        double total = orderAmt;
        double tax = 0;


            if (state.equals("WI")){
                double taxRate = .055;
                tax = orderAmt * taxRate;
                total = orderAmt + tax;
            }
        System.out.printf("The tax is $%.2f\n", tax);
        System.out.printf("The total is $%.2f.", total);






    }

}
