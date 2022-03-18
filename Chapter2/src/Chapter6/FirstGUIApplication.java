package Chapter6;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

public class FirstGUIApplication
{
	public void selectPanel()
	{
		// the panel for single prime numbers
		JPanel chooseFunc = new JPanel();
		chooseFunc.setLayout(new BoxLayout(chooseFunc, BoxLayout.X_AXIS));
		
		JCheckBox single = new JCheckBox();
		JCheckBox range = new JCheckBox();
		
		
	}
	
	public FirstGUIApplication()
	{
		JFrame window = new JFrame("Prime Finder");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		// title element
		JLabel title = new JLabel("Prime Finder");
		title.setFont(new Font("Comic Sans MS", Font.BOLD, 72));
		title.setHorizontalAlignment(JLabel.CENTER);
		
		// prime finder type select
		JButton button1 = new JButton("Click to not be bored...");
		button1.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		
		// the actual prime finder/checker
		JButton button2 = new JButton("Main things happen here");
		button2.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		
		// add all elements into program layout
		window.add(panel);
		panel.add(title, BorderLayout.NORTH);
		panel.add(button1, BorderLayout.EAST);
		panel.add(button2, BorderLayout.CENTER);
		
		window.setSize(1280, 720);
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FirstGUIApplication();
	}
}
