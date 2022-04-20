/*

Program: Adder.java          Last Date of this Revision: April 20, 2022

Purpose: A game where you earn points for answering the right sum for each equation.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Adder implements ActionListener
{
	AdderBase calculator = new AdderBase();
	
	private static final JFrame window = new JFrame("Adder Game");
	private static final JPanel generalPanel = new JPanel(new BorderLayout());
	private static final JPanel mainPanel = new JPanel();
	private static final JPanel headerPanel = new JPanel(new FlowLayout());
	private static final JPanel bottomPanel = new JPanel(new FlowLayout());
	private static final GroupLayout main = new GroupLayout(mainPanel);
	private JLabel header, equation, pointsDisplay, roundsDisplay;
	private JButton submit, end;
	private JTextField answerField;
	private int tries, rounds;
	
	public Adder()
	{
		
		calculator.generateQuestion(1, 20);
		rounds = 1;
		
		// component setup
		header = new JLabel("Enter the correct sum");
		equation = new JLabel(calculator.getQuestion());
		roundsDisplay = new JLabel("Round: " + rounds);
		pointsDisplay = new JLabel("Points: " + calculator.getPoints());
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		end = new JButton("End");
		end.addActionListener(this);
		
		answerField = new JTextField(8);
		
		
		// layout setup
		generalPanel.add(headerPanel, BorderLayout.NORTH);
		generalPanel.add(mainPanel, BorderLayout.CENTER);
		generalPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		headerPanel.add(header);
		
		main.setAutoCreateGaps(true);
		main.setAutoCreateContainerGaps(true);
		main.setHorizontalGroup 
		(
			main.createSequentialGroup()
				.addGroup
				(
					main.createParallelGroup(GroupLayout.Alignment.CENTER, false)
					.addComponent(equation)
					.addComponent(end)
				)
				.addGroup
				(	main.createParallelGroup(GroupLayout.Alignment.CENTER, false)
					.addComponent(answerField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(submit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
		main.setVerticalGroup
		(
			main.createSequentialGroup()
				.addGroup
				(
					main.createParallelGroup(GroupLayout.Alignment.BASELINE, false)
					.addComponent(equation)
					.addComponent(answerField)
				)
				.addGroup
				(
					main.createParallelGroup(GroupLayout.Alignment.BASELINE, false)
					.addComponent(end)
					.addComponent(submit)
				)
		);
		
		mainPanel.setLayout(main);

		bottomPanel.add(roundsDisplay);
		bottomPanel.add(pointsDisplay);
		
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == end)
		{
			// prints out the final results
			equation.setText("...");
			pointsDisplay.setText(String.format("Points: %d", calculator.getPoints()));
			
			System.out.println("'End' pressed.");
		}
		else if (evt.getSource() == submit)
		{
			// grab the integer or insert 0 for each text field, and compare to the actual sum
			try {calculator.saveUserSum(Integer.parseInt(answerField.getText()));}
			catch (Exception e) {calculator.saveUserSum(0);}

			if (calculator.userSumCheck() == true)
			{
				System.out.println("Tries: " + tries);
				calculator.addPoints(tries);
				System.out.println("Tries: " + tries);
				pointsDisplay.setText(String.format("Points: +%d", calculator.getPointsAccumulated()));

				// reset for next question
				tries = 0;
				rounds++;
				calculator.generateQuestion(1, 20);
				
				equation.setText(calculator.getQuestion());
				roundsDisplay.setText("Round: " + rounds);
				
			}
			else
			{
				tries++;

				if (tries > 1)
				{

				}
			}
			
			answerField.setText("");

			
			System.out.println("'Submit' pressed.");
		}
	}

	public void launch()
	{
		window.add(generalPanel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200, 200);
		window.setResizable(true);
		window.setVisible(true);
	}
	
	
	
	public static void main(String[] args)
	{
		Adder app = new Adder();
		app.launch();
	}

}
