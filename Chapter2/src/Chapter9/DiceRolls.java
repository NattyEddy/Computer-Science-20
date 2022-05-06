/*

Program: DiceRolls.java          Last Date of this Revision: May 6, 2022

Purpose: Roll dice and print out the number of times a number was called.

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

	// all the variables needed
	private final int[] outcomes = new int[19];
	private final JLabel[] labels = new JLabel[16];
	private int numRolls, outcome;
	private String print;
	
	// most components of GUI
	private JPanel main;
	private JPanel center;
	private JPanel output;
	private JPanel alignOut;
	private JFrame window;
	private JTextField input;
	private JLabel title;
	private JLabel instruction;
	
	// JLabel for each result in an array
	private JLabel diceRolls;
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
		// initialize variables
		numRolls = 0; outcome = 0;
		print = "";
		
		// array setup
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
		
		
		// initialize components
		title = new JLabel("Roll the Dice!");
		title.setHorizontalAlignment(JLabel.CENTER);
		instruction = new JLabel("Write the number of dice rolls, then press ENTER to roll: ");
		output = new JPanel(new GridLayout(17, 1));
		alignOut = new JPanel(new FlowLayout());
		input = new JTextField(10);
		input.addActionListener(this);
		
		window = new JFrame("Dice Rolls Application");
		main = new JPanel(new BorderLayout());
		center = new JPanel(new FlowLayout());
		
		output.add(diceRolls = new JLabel());
		for (int i = 0; i < 16; i++)
		{
			labels[i] = new JLabel();
			output.add(labels[i]);
		}
		
		// add components to panels
		main.add(title, BorderLayout.NORTH);
		main.add(center, BorderLayout.CENTER);
		main.add(alignOut, BorderLayout.SOUTH);
		center.add(instruction);
		center.add(input);
		alignOut.add(output);
		
	}
	
	private void setRolls(int rolls)
	{
		numRolls = rolls;
	}
	
	// randomized dice roll
	private void rollDice()
	{
		for (int r = 0; r < numRolls; r++)
		{
			outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
			outcomes[outcome] += 1;
		}
	}
	
	// reset outcomes array to 0
	private void resetOutcomes()
	{
		
		for (int i = 3; i < outcomes.length; i++)
		{
			outcomes[i] = 0;
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		
		// take text field input and set numRolls
		try{setRolls(Integer.parseInt(input.getText()));}
		catch (Exception e) {setRolls(0);}
		input.setText(null);
		diceRolls.setText("Number of rolls: " + numRolls);
		
		resetOutcomes();
		rollDice();
		
		// print outcome for each possible number to be rolled (3 - 18)
		for (int i = 3; i < outcomes.length; i++)
		{
			print = String.format("Rolled %d: %d", i, outcomes[i]);
			labels[i - 3].setText(print);
		}
		
	}
	
	
	public void launch()
	{
		window.add(main);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 400);
		window.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args)
	{

		DiceRolls app = new DiceRolls();
		app.launch();
	
	}

}