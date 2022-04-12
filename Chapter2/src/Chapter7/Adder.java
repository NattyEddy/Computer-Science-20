/*

Program: Adder.java          Last Date of this Revision: April 12, 2022

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
	private static final JPanel mainPanel = new JPanel(new GridLayout(2, 2, 10, 10));
	private static final JPanel headerPanel = new JPanel(new FlowLayout());
	private JLabel header, equation, pointsDisplay;
	private JButton submit, end;
	private JTextField answerField;
	private int tries;
	
	public Adder()
	{
		
		calculator.generateQuestion(1, 20);
		
		// component setup
		header = new JLabel("Enter the correct sum");
		equation = new JLabel(calculator.getQuestion());
		pointsDisplay = new JLabel("...");
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		end = new JButton("End");
		end.addActionListener(this);
		
		answerField = new JTextField(8);
		
		
		// layout setup
		generalPanel.add(headerPanel, BorderLayout.NORTH);
		generalPanel.add(mainPanel, BorderLayout.CENTER);
		generalPanel.add(pointsDisplay, BorderLayout.SOUTH);

		headerPanel.add(header);
		
		mainPanel.add(equation);
		mainPanel.add(answerField);
		mainPanel.add(submit);
		mainPanel.add(end);
		
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == end)
		{
			// clears the text fields and prints out the final results
			answerField.setText("");
			pointsDisplay.setText(String.format("%d", calculator.getPoints()));
			
			System.out.println("'End' pressed.");
		}
		else if (evt.getSource() == submit)
		{
			// grab the integer or insert 0 for each text field, and compare to the actual sum
			calculator.saveUserSum(Integer.parseInt(answerField.getText()));
			if (calculator.userSumCheck() == true)
                {
                    calculator.addPoints(tries);
                }
                else
                {
                    tries++;
                }
			
			System.out.println("'Submit' pressed.");
		}
	}

	public void launch()
	{
		window.add(generalPanel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);
	}
	
	
	
	public static void main(String[] args)
	{
		Adder app = new Adder();
		app.launch();
	}

}
