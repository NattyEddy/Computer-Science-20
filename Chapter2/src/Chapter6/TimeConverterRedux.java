/*

Program: TimeConverter.java          Last Date of this Revision: March 30, 2022

Purpose: Convert a unit of time as per user request, another implementation.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter6;

import java.util.Scanner;

public class TimeConverterRedux 
{
	static Scanner userInput = new Scanner(System.in);
	
	/*
	 * Takes the values, the int for the corresponding
	 * conversion, does the math, and prints the result.
	 * 
	 * */
	public static String timeConversion(double time, int conversion)
	{
		// strings for the type of conversion, and double as the "function of x"
		String a = "", b = "";
		double fx = 0;
		
		switch (conversion)
		{
			case 1:
				a = "hours"; b = "minutes";
				fx = time * 60;
				break;
			case 2:
				a = "hours"; b = "days";
				fx = time / 24;
				break;
			case 3:
				a = "minutes"; b = "hours";
				fx = time / 60;
				break;
			case 4:
				a = "days"; b = "hours";
				fx = time * 24;
				break;
		}
		
		return String.format("When converted, %.2f %s is equal to %.2f %s.", time, a, fx, b);
	}
	
	public static void main(String[] args)
	{
		int conversion;
		double userValue;
		
		// list conversions and prompt user for a conversion to make
		System.out.println("Conversions: 	\n"
				+ "1. Hours to Minutes		\n"
				+ "2. Hours to Days			\n"
				+ "3. Minutes to Hours		\n"
				+ "4. Days to Hours");
		
		// repeats until user is in range
		do
		{
			System.out.print("Choose a corresponding value for the desired conversion: ");
			conversion = userInput.nextInt();
		}
		while (conversion < 1 || conversion > 4);	
		
		// message to confirm which conversion is being done
		switch (conversion)
		{
			case 1:
				System.out.print("\nWe are converting from hours into minutes.\n");
				break;
			case 2:
				System.out.print("\nWe are converting from hours into days.\n");
				break;
			case 3:
				System.out.print("\nWe are converting from minutes into hours.\n");
				break;
			case 4:
				System.out.print("\nWe are converting from days into hours.\n");
				break;
		}
		System.out.println("===========================================================");
		
		// prompt the user to input a time to convert
		do
		{
			System.out.print("Enter the value to be converted: ");
			userValue = userInput.nextDouble();
			System.out.println();
		}
		while (userValue < 0);
		
		// print the result
		System.out.println(timeConversion(userValue, conversion));
	}
}

/*

Conversions: 	
1. Hours to Minutes		
2. Hours to Days			
3. Minutes to Hours		
4. Days to Hours
Choose a corresponding value for the desired conversion: 8
Choose a corresponding value for the desired conversion: 4

We are converting from days into hours.
===========================================================
Enter the value to be converted: -999

Enter the value to be converted: 365

When converted, 365.00 days is equal to 8760.00 hours.

*/