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
	private final Object[] labels = new Object[16];
	private int numRolls, outcome;
	private String print;
	
	private JPanel main;
	private JPanel center;
	private JFrame window;
	private JTextField input;
	
	private JLabel title;
	private JLabel output;
	private JLabel instruction;
	
	private JLabel three;
	private JLabel four;
	private JLabel five;
	private JLabel six; 
	private JLabel seven;
	private JLabel eight;
	private JLabel nine;
	private JLabel ten;
	private JLabel eleven;
	private JLabel twelve;
	private JLabel thirteen;
	private JLabel fourteen;
	private JLabel fifteen;
	private JLabel sixteen;
	private JLabel seventeen;
	private JLabel eighteen;
	
	public DiceRolls()
	{
		numRolls = 0; outcome = 0;
		print = "";
		
		labels[0] = three;
		labels[1] = four;
		labels[2] = five;
		labels[3] = six;
		labels[4] = seven;
		labels[5] = eight;
		labels[6] = nine;
		labels[7] = ten;
		labels[8] = eleven;
		labels[9] = twelve;
		labels[10] = thirteen;
		labels[11] = fourteen;
		labels[12] = fifteen;
		labels[13] = sixteen;
		labels[14] = seventeen;
		labels[15] = eighteen;
		
		
		title = new JLabel("Roll the Dice!");
		title.setHorizontalAlignment(JLabel.CENTER);
		instruction = new JLabel("Write the number of dice rolls, then press ENTER to roll: ");
		output = new JLabel("test");
		output.setHorizontalAlignment(JLabel.CENTER);
		input = new JTextField(10);
		input.addActionListener(this);
		
		window = new JFrame("Dice Rolls Application");
		main = new JPanel(new BorderLayout());
		center = new JPanel(new FlowLayout());
		
		main.add(title, BorderLayout.NORTH);
		main.add(center, BorderLayout.CENTER);
		main.add(output, BorderLayout.SOUTH);
		center.add(instruction);
		center.add(input);
	}
	
	private void setRolls(int rolls)
	{
		numRolls = rolls;
	}
	
	private void rollDice()
	{
		for (int r = 0; r < numRolls; r++)
		{
			outcome = (int)((outcomes.length - 3) * Math.random() + 3);
			outcomes[outcome] += 1;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
//		System.out.println("Hello World!");
		
		setRolls(Integer.parseInt(input.getText()));
		input.setText(null);
		
		rollDice();
		
		for (int i = 3; i < outcomes.length; i++)
		{
			print += String.format("Rolled %d: %d; ", i, outcomes[i]);
		}
		
		output.setText(print);
		
	}
	
	
	public void launch()
	{
		window.add(main);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 200);
		window.setVisible(true);
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