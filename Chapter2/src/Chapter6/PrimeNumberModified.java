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

public class PrimeNumberModified
{
	static Scanner userInput = new Scanner(System.in);
	static ArrayList<Integer> primeValues = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		int[] range = {0, 0};
		
		// ask for a valid number for the low end of the range
		do
		{
			System.out.print("Enter the lower natural number of the range: ");
			range[0] = userInput.nextInt();
		}
		while (range[0] < 1);
		
		// ask for the greater number of the range
		do
		{
			System.out.print("Enter the greater natural number of the range: ");
			range[1] = userInput.nextInt();
		}
		while (range[1] < 1);

		// introduces the values between the user's range
		System.out.printf("The following is the list of prime numbers between %d and %d: \n", range[0], range[1]);

		// find the prime values in the range, then print the array
		for (int i = range[0]; i <= range[1]; i++)
		{
			if (PrimeNumber.primeCheck(i) == true)
			{
				primeValues.add(i);
			}
		}
		System.out.println(primeValues);
	}
}

/* 

Enter the lower natural number of the range: 7
Enter the greater natural number of the range: 367
The following is the list of prime numbers between 7 and 367:
[7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 
97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 
181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 
277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367]

*/