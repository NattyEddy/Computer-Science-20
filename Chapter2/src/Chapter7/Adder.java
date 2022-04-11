/*

Program: Adder.java          Last Date of this Revision: April 8, 2022

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

	private static final JFrame window = new JFrame("Adder Game");
	private static final JPanel generalPanel = new JPanel(new BorderLayout());
	private static final JPanel mainPanel = new JPanel(new GridLayout(2, 2, 10, 10));
	private static final JPanel headerPanel = new JPanel(new FlowLayout());
	private JLabel header, equation, points;
	private JButton submit, end;
	private JTextField answerField;
	
	public Adder()
	{
		AdderBase calculator = new AdderBase();
		
		
		header = new JLabel("Enter the correct sum");
		equation = new JLabel(calculator.getQuestion());
		points = new JLabel("...");
		
		submit = new JButton("Submit");
		end = new JButton("End");
		
		answerField = new JTextField(8);
		answerField.setSize(50, 10);
		
		
		generalPanel.add(headerPanel, BorderLayout.NORTH);
		generalPanel.add(mainPanel, BorderLayout.CENTER);
		generalPanel.add(points, BorderLayout.SOUTH);

		headerPanel.add(header);
		
		mainPanel.add(equation);
		mainPanel.add(answerField);
		mainPanel.add(submit);
		mainPanel.add(end);
		
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource() == submit)
		{
			// clears the text fields and resets the balance
		}
		else if (evt.getSource() == end)
		
		{
			// grab the integer or insert 0 for each text field, and add the coins corresponding
			
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
