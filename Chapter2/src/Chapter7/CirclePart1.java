/*

Program: CirclePart1.java          Last Date of this Revision: April 4, 2022

Purpose: Print the circumference of a circle via the Circle class.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

public class CirclePart1
{
	public static void main(String[] args)
	{
		Circle spot = new Circle();
		
		spot.setRadius(3);
		System.out.printf("Circle radius: %.3f.\n", spot.getRadius());
		System.out.printf("Circle circumference: %.3f.\n", spot.getCircumference());
	}
}

/*

Circle radius: 3.000.
Circle circumference: 18.850.

*/
 