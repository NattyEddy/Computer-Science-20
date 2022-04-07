/*

Program: MySavings.java          Last Date of this Revision: April 6, 2022

Purpose: The GUI application that uses the PiggyBank class.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MySavings implements ActionListener
{

	PiggyBank myAccount = new PiggyBank();

	private static final JTextArea instruction = new JTextArea(2, 20);
	private static final JFrame window = new JFrame("My Savings Account");
	private static final JPanel panel = new JPanel(new BorderLayout());
	private static final JPanel main = new JPanel(new GridLayout(7, 2));
	private static final JPanel headerPanel = new JPanel(new FlowLayout());
	private JLabel twoonies, loonies, quarters, dimes, nickels, pennies, total;
	private JTextField twooniesField, looniesField, quartersField, dimesField, nickelsField, penniesField;
	private JButton clear, showBalance;
	private Font header, labelFont, result;
	
	
	public MySavings()
	{
		// component setup
		header = new Font("Cambria", Font.BOLD, 24);
		labelFont = new Font("Arial", Font.BOLD, 14);
		result = new Font("Maven Pro", Font.ITALIC, 18);
		
		twoonies = new JLabel("Twoonies:");
		loonies = new JLabel("Loonies:");
		quarters = new JLabel("Quarters:");
		dimes = new JLabel("Dimes:");
		nickels = new JLabel("Nickels:");
		pennies = new JLabel("Pennies:");
		total = new JLabel(myAccount.toString());
		
		twooniesField = new JTextField();
		looniesField = new JTextField();
		quartersField = new JTextField();
		dimesField = new JTextField();
		nickelsField = new JTextField();
		penniesField = new JTextField();
		
		clear = new JButton("Clear");
		clear.addActionListener(this);
		showBalance = new JButton("Submit");
		showBalance.addActionListener(this);

    	instruction.setText("Enter the number of respective coins in your piggybank:");
		instruction.setWrapStyleWord(true);
    	instruction.setLineWrap(true);
    	instruction.setEditable(false);
    	instruction.setFocusable(false);

		instruction.setFont(header);
		twoonies.setFont(labelFont);
		loonies.setFont(labelFont);
		quarters.setFont(labelFont);
		dimes.setFont(labelFont);
		nickels.setFont(labelFont);
		pennies.setFont(labelFont);
		total.setFont(result);
		total.setHorizontalAlignment(JLabel.CENTER);
		
		
		// layout setup
		panel.add(headerPanel, BorderLayout.NORTH);
		panel.add(main, BorderLayout.CENTER);
		panel.add(total, BorderLayout.SOUTH);

		headerPanel.add(instruction);
		
		main.add(twoonies);
		main.add(twooniesField);
		main.add(loonies);
		main.add(looniesField);
		main.add(quarters);
		main.add(quartersField);
		main.add(dimes);
		main.add(dimesField);
		main.add(nickels);
		main.add(nickelsField);
		main.add(pennies);
		main.add(penniesField);
		main.add(clear);
		main.add(showBalance);
	}
	
	// when you press clear or submit the coins
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == clear)
		{
			twooniesField.setText("");
			looniesField.setText("");
			quartersField.setText("");
			dimesField.setText("");
			nickelsField.setText("");
			penniesField.setText("");
		}
		else if (e.getSource() == showBalance)
		{
			myAccount.addTwoonies(Integer.parseInt(twooniesField.getText()));
			myAccount.addLoonies(Integer.parseInt(looniesField.getText()));
			myAccount.addQuarters(Integer.parseInt(quartersField.getText()));
			myAccount.addDimes(Integer.parseInt(dimesField.getText()));
			myAccount.addNickels(Integer.parseInt(nickelsField.getText()));
			myAccount.addPennies(Integer.parseInt(penniesField.getText()));
		}
		total.setText(myAccount.toString());
	}

	public void launch()
	{
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);
	}
	
	
	
	public static void main(String[] args)
	{
		MySavings app = new MySavings();
		app.launch();
	}

}
