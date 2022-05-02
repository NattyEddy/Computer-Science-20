/*

Program: DiceRolls.java          Last Date of this Revision: May 2, 2022

Purpose: List student names in an array and print them.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiceRolls implements ActionListener
{

	private final int[] outcomes = new int[19];
	private int numRolls;
	private int outcome;
	
	private JLabel title;
	private JLabel output;
	private JPanel main;
	private JFrame window;
	private JTextField input;
	
	public DiceRolls()
	{
		numRolls = 0;
		outcome = 0;
		
		
		title = new JLabel("Roll the Dice!");
		title.setHorizontalAlignment(JLabel.CENTER);
		output = new JLabel("test");
		output.setHorizontalAlignment(JLabel.CENTER);
		input = new JTextField();
		
		window = new JFrame("Dice Rolls Application");
		main = new JPanel(new BorderLayout());
		
		main.add(title, BorderLayout.NORTH);
		main.add(input, BorderLayout.CENTER);
	}
	
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
	
	public void launch()
	{
		window.add(main);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hello World!");
	}
	
	
	
	// test main
	public static void main(String[] args)
	{
//		DiceRolls console = new DiceRolls();
//		console.setRolls(1000);
//		console.rollDice();
//		
//		for (int i = 3; i < console.outcomes.length; i++)
//		{
//			System.out.println((i) + ": " + console.outcomes[i]);
//		}
//		
//		System.out.println("Number of rolls: " + console.getRolls());
//		System.out.println("Array length: " + console.outcomes.length);
	
		DiceRolls app = new DiceRolls();
		app.launch();
	
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