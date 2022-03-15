/*

Program: NumbersSum.java          Last Date of this Revision: March 15, 2022

Purpose: Prompt the user to input a number, then print all numbers between 1 and their number.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersSum
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> all = new ArrayList<Integer>();
		int userNumber;
		
		System.out.print("Enter a natural number for the max value: ");
		userNumber = userInput.nextInt();
		
		for (int x = 1; x <= userNumber; x++)
		{
			System.out.println(x);
			all.add(x);
		}
		
		System.out.println("=============================================");
		System.out.println(((1 + userNumber) * all.size()) / 2);
	}
}

/*

Enter a natural number for the max value: 20
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
=============================================
210

*/
