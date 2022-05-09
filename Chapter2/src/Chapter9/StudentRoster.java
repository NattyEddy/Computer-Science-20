/*

Program: StudentRoster.java          Last Date of this Revision: May 9, 2022

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
		students = Integer.parseInt(input.nextLine());
		System.out.println();
		
		studentNames = new String[students];
		
		for (int i = 0; i < studentNames.length; i++)
		{
			System.out.printf("Enter student %ds name: ", i + 1);
			studentNames[i] = input.nextLine();
		}
		
		System.out.println("\n=============================\n");
		System.out.println("STUDENT ROSTER:");

		for (String i : studentNames)
		{
			System.out.println(i);
		}

	}

}


/*
 
How many students are in your classroom? 5

Enter student 1s name: tegan
Enter student 2s name: mile
Enter student 3s name: nat
Enter student 4s name: kayden
Enter student 5s name: aydan

=============================

STUDENT ROSTER:
tegan
mile
nat
kayden
aydan

   
*/
 