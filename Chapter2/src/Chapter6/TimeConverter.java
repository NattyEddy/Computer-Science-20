/*

Program: TimeConverter.java          Last Date of this Revision: March 8, 2022

Purpose: Convert a unit of time as per user request.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter6;

import java.util.Scanner;

public class TimeConverter 
{
	public static double hoursToMinutes(double hours)
	{
		double min = hours * 60;
		return min;
	}
	public static double hoursToDays(double hours)
	{
		double days = hours / 24;
		return days;
	}
	public static double minutesToHours(double minutes)
	{
		double hrs = minutes / 60;
		return hrs;
	}
	public static double daysToHours(double days)
	{
		double hrs = days * 24;
		return hrs;
	}
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int userConvert;
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
			userConvert = userInput.nextInt();
		}
		while (userConvert < 1 || userConvert > 4);	
		
		// message to confirm which conversion is being done
		switch (userConvert)
		{
			case 1:
				System.out.print("We are converting from hours into minutes.\n");
				break;
			case 2:
				System.out.print("We are converting from hours into days.\n");
				break;
			case 3:
				System.out.print("We are converting from minutes into hours.\n");
				break;
			case 4:
				System.out.print("We are converting from days into hours.\n");
				break;
		}
		
		// prompt the user to input a time to convert
		System.out.print("Enter the value to be converted: ");
		userValue = userInput.nextDouble();
		
		// print the result
		switch (userConvert)
		{
			case 1:
				System.out.printf("%.1f hours converts to %.2f minutes.", userValue, hoursToMinutes(userValue));
				break;
			case 2:
				System.out.printf("%.1f hours converts to %.2f days.", userValue, hoursToDays(userValue));
				break;
			case 3:
				System.out.printf("%.1f minutes converts to %.2f hours.", userValue, minutesToHours(userValue));
				break;
			case 4:
				System.out.printf("%.1f days converts to %.2f hours.", userValue, daysToHours(userValue));
				break;
		}
	}
}

/*

Conversions: 
1. Hours to Minutes
2. Hours to Days
3. Minutes to Hours
4. Days to Hours
Choose a corresponding value for the desired conversion: 0
Choose a corresponding value for the desired conversion: 7
Choose a corresponding value for the desired conversion: 5
Choose a corresponding value for the desired conversion: 1
We are converting from hours into minutes.
Enter the value to be converted: 88
88.0 hours converts to 5280.00 minutes.

*/