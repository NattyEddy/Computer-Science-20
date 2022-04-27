/*

Program: Squares.java          Last Date of this Revision: April 27, 2022

Purpose: Add squares of indexes to the array and print.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter9;

public class Squares
{
	
	public static void main(String[] args)
	{
		int[] squares = new int[5];
		
		for (int i = 0; i < squares.length; i++)
		{
			squares[i] = i * i;
			System.out.println(squares[i]);
		}

	}

}


/*
 
 0
 1
 4
 9
 16
 
*/