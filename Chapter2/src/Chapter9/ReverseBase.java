/*

Program: ReverseBase.java          Last Date of this Revision: April 27, 2022

Purpose: Create array of indices, then print them in the reverse order.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter9;

public class ReverseBase
{

	int[] indices = new int[10];
	String reversedList = "";
	
	public ReverseBase()
	{
		for (int i = indices.length - 1; i >= 0; i--)
		{
			indices[i] = i;
			reversedList += String.format("%d; ", i);
		}
	}
	
	public static void main(String[] args)
	{
		ReverseBase test = new ReverseBase();
		
		System.out.println(test.reversedList);
	}

}

/*

 9; 8; 7; 6; 5; 4; 3; 2; 1; 0; 
 
*/