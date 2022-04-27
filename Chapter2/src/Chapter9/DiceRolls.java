/*

Program: DiceRolls.java          Last Date of this Revision: April 27, 2022

Purpose: List student names in an array and print them.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter9;

import java.util.Scanner;

public class DiceRolls
{

	private final int[] outcomes = new int[15];
	private final Scanner input = new Scanner(System.in);
	private int numRolls;
	private int outcome;
	
	public void setRolls(int rolls)
	{
		numRolls = rolls;
	}
	
	public int getRolls()
	{
		return numRolls;
	}
	
	public void rollDice()
	{
		for (int r = 0; r < numRolls; r++)
		{
			outcome = (int)(18 * Math.random() + 3);
			outcomes[outcome - 3] += 1;
		}
	}
	
	public static void main(String[] args)
	{
		DiceRolls console = new DiceRolls();
		console.setRolls(50);
		
		for (int i = 3; i <= 18; i++)
		{
			System.out.println(i + ": " + console.outcomes[i]);
		}
	}

}

/*

 
 
*/