/*

Program: DiceRolls.java          Last Date of this Revision: April 28, 2022

Purpose: List student names in an array and print them.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter9;

import java.util.Scanner;

public class DiceRolls
{

	private final int[] outcomes = new int[19];
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
			outcome = (int)((outcomes.length - 3) * Math.random() + 3);
			outcomes[outcome] += 1;
		}
	}
	
	// test main
	public static void main(String[] args)
	{
		DiceRolls console = new DiceRolls();
		console.setRolls(1000);
		console.rollDice();
		
		for (int i = 3; i < console.outcomes.length; i++)
		{
			System.out.println((i) + ": " + console.outcomes[i]);
		}
		
		System.out.println("Number of rolls: " + console.getRolls());
		System.out.println("Array length: " + console.outcomes.length);
	}

}

/*

3: 52
4: 61
5: 62
6: 77
7: 56
8: 68
9: 71
10: 66
11: 58
12: 65
13: 49
14: 58
15: 69
16: 67
17: 60
18: 61
Number of rolls: 1000
Array length: 19

 
*/