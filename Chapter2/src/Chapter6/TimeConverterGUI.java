/*

Program: TimeConverterGUI.java          Last Date of this Revision: March 29, 2022

Purpose: Convert a unit of time as per user request, in a GUI application.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter6;

import java.awt.*;
import javax.swing.*;


public class TimeConverterGUI
{
	public static void windowStartup()
	{
		JFrame window = new JFrame("Time Converter");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		
		
		window.setSize(720, 720);
		window.setVisible(true);
	}
	
	public static void mainPanelSetup()
	{
		JPanel main = new JPanel(new BorderLayout());
		
	}
	
	public static void main(String[] args)
	{
		windowStartup();
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 */
 