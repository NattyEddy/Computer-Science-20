/*

Program: Adder.java          Last Date of this Revision: April 26, 2022

Purpose: List student names in an array and print them.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter9;

import java.util.Scanner;

public class StudentRoster
{

	private static final Scanner input = new Scanner(System.in);
	private static String[] studentNames;
	
	public static void main(String[] args)
	{
		int students;
		
		System.out.print("How many students are in your classroom? ");
		students = input.nextInt();
		System.out.println();
		
		studentNames = new String[students];
		
		for (int i = 0; i < studentNames.length; i++)
		{
			System.out.printf("Enter student %ds name: ", i + 1);
			studentNames[i] = input.next();
		}
		
		System.out.println("\n=============================\n");
		System.out.println("STUDENT ROSTER:");

		for (int i = 0; i < studentNames.length; i++)
		{
			System.out.println(studentNames[i]);
		}

	}

}


/*
 
  
  
  
*/
 