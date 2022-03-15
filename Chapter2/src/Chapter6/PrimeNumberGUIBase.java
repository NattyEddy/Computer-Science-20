/*

Program: PrimeNumberModified.java          Last Date of this Revision: March 9, 2022

Purpose: Prompt for two numbers, find prime numbers in that range, and print them.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberGUIBase
{
	static Scanner userInput = new Scanner(System.in);
	static ArrayList<Integer> primeValues = new ArrayList<Integer>();
	
	public static String printPrimes(int low, int high)
	{
		int[] range = {low, high};
		
		for (int i = range[0]; i <= range[1]; i++)
		{
			if (PrimeNumber.primeCheck(i) == true)
			{
				primeValues.add(i);
			}
		}
		
		return primeValues.toString();
	}
	
	public static void main(String[] args)
	{
		int x, y;
		
		// ask for a valid number for the low end of the range
		do
		{
			System.out.print("Enter the lower natural number of the range: ");
			x = userInput.nextInt();
		}
		while (x < 1);
		
		// ask for the greater number of the range
		do
		{
			System.out.print("Enter the greater natural number of the range: ");
			y = userInput.nextInt();
		}
		while (y < x);

		// introduces the values between the user's range
		System.out.printf("The following is the list of prime numbers between %d and %d: \n", x, y);

		// find the prime values in the range, then print the array
		System.out.println(printPrimes(x, y));
		
	}
}

/* 



*/