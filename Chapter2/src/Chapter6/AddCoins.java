/*

Program: AddCoins.java          Last Date of this Revision: March 9, 2022

Purpose: Prompt the user to enter their quantities of change, then add up the total dollar amount and print it.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter6;

import java.util.Scanner;

public class AddCoins
{
    static Scanner userInput = new Scanner(System.in);
    
    // method to output the string of a dollar value
    public static String getDollarAmount(int quarters, int dimes, int nickels, int pennies)
    {
        double cent25 = quarters * 25, cent10 = dimes * 10, cent5 = nickels * 5, cent1 = pennies;
        double totalDollarValue = (cent25 + cent10 + cent5 + cent1) / 100;

        // the string formatted to show the dollar sign and the valid cent values
        return String.format("$%.2f", totalDollarValue);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter your total corresponding coins: \n");

        System.out.print("Quarters: ");
        int quarters = userInput.nextInt();
        
        System.out.print("Dimes: ");
        int dimes = userInput.nextInt();
        
        System.out.print("Nickels: ");
        int nickels = userInput.nextInt();
        
        System.out.print("Pennies: ");
        int pennies = userInput.nextInt();
        
        System.out.println("-------------------------------------");

        System.out.printf("Total: %s", getDollarAmount(quarters, dimes, nickels, pennies));
    }
}

/* 

Enter your total corresponding coins: 

Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8
-------------------------------------
Total: $1.08

*/