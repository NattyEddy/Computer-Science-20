/*

Program: CirclePart3.java          Last Date of this Revision: April 4, 2022

Purpose: Print the circumference of a circle via the Circle class, and use the displayAreaFormula() method.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

public class CirclePart3
{
	public static void main(String[] args)
	{
		Circle spot = new Circle(5);
		
		System.out.printf("Circle radius: %.2f\n", spot.getRadius());
		System.out.printf("Circle area: %.2f\n", spot.getArea());
		Circle.displayAreaFormula();
	}
}

/*

Circle radius: 5.000.
Circle circumference: 31.416.

*/
 