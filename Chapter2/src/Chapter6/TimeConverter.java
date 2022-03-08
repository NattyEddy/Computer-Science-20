/*

Program: TimeConverter.java          Last Date of this Revision: March 8, 2022

Purpose: Generate a number, then have the user guess the number until they win!

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
		
		System.out.println("Conversions: 	\n"
				+ "1. Hours to Minutes		\n"
				+ "2. Hours to Days			\n"
				+ "3. Minutes to Hours		\n"
				+ "4. Days to Hours");
		System.out.print("Choose a corresponding value for the desired conversion: ");
		userConvert = userInput.nextInt();
		
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
		
		
		
		System.out.print("Enter the value to be converted: ");
		userValue = userInput.nextDouble();
		
		System.out.print(hoursToMinutes(userValue));
	}
}
