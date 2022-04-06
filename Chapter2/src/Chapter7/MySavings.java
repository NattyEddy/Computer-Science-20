/*

Program: MySavings.java          Last Date of this Revision: April 6, 2022

Purpose: The GUI application that uses the PiggyBank class.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

import java.awt.*;
import javax.swing.*;

public class MySavings
{

	private static final JLabel instruction = new JLabel("Enter the number of respective coins in your piggybank:");
	private static final JFrame window = new JFrame("My Savings Account");
	private static final JPanel panel = new JPanel(new BorderLayout());
	private static final JPanel main = new JPanel(new GridLayout(2, 7));
	private JLabel twoonies, loonies, quarters, dimes, nickels, pennies, total;
	private JTextField twooniesField, looniesField, quartersField, dimesField, nickelsField, penniesField;
	private JButton clear, showBalance;
	
	
	public MySavings()
	{
		// component setup
		twoonies = new JLabel("Twoonies:");
		loonies = new JLabel("Loonies:");
		quarters = new JLabel("Quarters:");
		dimes = new JLabel("Dimes:");
		nickels = new JLabel("Nickels:");
		pennies = new JLabel("Pennies:");
		total = new JLabel("");
		
		twooniesField = new JTextField();
		looniesField = new JTextField();
		quartersField = new JTextField();
		dimesField = new JTextField();
		nickelsField = new JTextField();
		penniesField = new JTextField();
		
		clear = new JButton("Clear");
		showBalance = new JButton("Total");
		
		
		// layout setup
		panel.add(instruction, BorderLayout.NORTH);
		panel.add(main, BorderLayout.CENTER);
		panel.add(total, BorderLayout.SOUTH);
		
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
	
	
	public void windowStartup()
	{
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 500);
		window.setVisible(true);
	}
	
	
	
	public static void main(String[] args)
	{
		MySavings app = new MySavings();
		
		app.windowStartup();
	}

}
