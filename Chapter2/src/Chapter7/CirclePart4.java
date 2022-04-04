/*

Program: CirclePart3.java          Last Date of this Revision: April 4, 2022

Purpose: Print the radii of two circles and compare, using overridden equals() and toString() methods.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

public class CirclePart4
{
	public static void main(String[] args)
	{
		Circle spotA = new Circle(5);
		Circle spotB = new Circle(8);
		
		System.out.printf("First circle radius: %s\n", spotA.toString());
		System.out.printf("Second circle radius: %s\n", spotB.toString());
		
		if (spotA.equals(spotB) == true)
		{
			System.out.println("These circles are the same.");
		}
		else
		{
			System.out.println("These circles are not the same.");
		}
	}
}

/*

First circle radius: 5.00
Second circle radius: 8.00
These circles are not the same.

*/
 