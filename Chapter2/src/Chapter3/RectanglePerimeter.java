/*

Program: VariableInClassExample.java          Last Date of this Revision: March 9, 2022

Purpose: Take three numbers and add them together (context: distances in a race into total)

Author: Nathaniel Edillon
School: CHHS
Course: Computer Science 20
 

*/

package Chapter3;

import java.util.Scanner;

public class RectanglePerimeter 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a length: ");
		int l = userInput.nextInt();
		
		System.out.print("Enter a width: ");
		int w = userInput.nextInt();
		
		int perimeter = 2 * (l + w);
		System.out.printf("The perimeter of this rectangle is %d units.", perimeter);
	}
}

/* Screen dump 

Enter a length: 15
Enter a width: 8
The perimeter of this rectangle is 46 units.

*/