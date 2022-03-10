/*

Program: PrimeNumber.java          Last Date of this Revision: March 9, 2022

Purpose: Prompt for a number, and check if it's a prime number.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter6;

import java.util.Scanner;

public class PrimeNumber
{
	static Scanner userInput = new Scanner(System.in);
	
	public static boolean primeCheck(int numberToTest)
	{
		// the following line intializes the boolean that will be outputted
		boolean isPrime = true;
		
		// this checks the number to determine if it's not prime
		for (int i = numberToTest - 1; i >= 2; i--)
		{
			if (numberToTest % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args)
	{
		int enteredValue;
		
		// ask for a valid number to check
		do
		{
			System.out.print("Enter a natural number to check if it's prime: ");
			enteredValue = userInput.nextInt();
		}
		while (enteredValue < 1);
		
		// once determined, print the result
		if (primeCheck(enteredValue) == true)
		{
			System.out.printf("The number %d is prime!", enteredValue);
		}
		else
		{
			System.out.printf("The number %d is not prime.", enteredValue);
		}
	}
}

/* 

Enter a natural number to check if it's prime: 0
Enter a natural number to check if it's prime: -3
Enter a natural number to check if it's prime: 7
The number 7 is prime!

*/