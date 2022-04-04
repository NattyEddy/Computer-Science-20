/*

Program: CirclePart2.java          Last Date of this Revision: April 4, 2022

Purpose: Print the circumference of a circle via the Circle class, with the overloaded constructer.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

public class CirclePart2
{
	public static void main(String[] args)
	{
		Circle spot = new Circle(5);

		System.out.printf("Circle radius: %.3f.\n", spot.getRadius());
		System.out.printf("Circle circumference: %.3f.\n", spot.getCircumference());
	}
}

/*

Circle radius: 5.000.
Circle circumference: 31.416.

*/
 