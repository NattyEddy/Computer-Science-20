/*

Program: ReverseGUI.java          Last Date of this Revision: May 10, 2022

Purpose: Print the reversed array in ReverseBase.java

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter9;

import java.awt.Font;
import javax.swing.*;

public class ReverseGUI
{

	// components used
	private JFrame window;
	private JLabel output;
	private Font arial;
	
	private ReverseBase base;
	
	public ReverseGUI()
	{
		
		// initialization of components
		base = new ReverseBase();
		window = new JFrame("Countdown");
		output = new JLabel(base.reversedList);
		arial = new Font("Arial", Font.BOLD, 16);
		output.setHorizontalAlignment(JLabel.CENTER);
		output.setFont(arial);
		
		// app launch
		window.add(output);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 300);
		window.setVisible(true);
	
	}
	
	
	public static void main(String[] args)
	{
		
		ReverseGUI app = new ReverseGUI();
		
	}

}
