package Chapter6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class FirstGUIApplication
{	
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
		JPanel chooseFunc = new JPanel();
		chooseFunc.setLayout(new BoxLayout(chooseFunc, BoxLayout.X_AXIS));
		chooseFunc.setBackground(Color.gray);
		
		String[] choices = {"Single", "Range"};
		JList options = new JList(choices);
		options.setSelectedIndex(0);
		options.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		
		Dimension minSize = new Dimension(25, 100);
		Dimension prefSize = new Dimension(100, 100);
		Dimension maxSize = new Dimension(Short.MAX_VALUE, 100);
		
		chooseFunc.add(new Box.Filler(minSize, prefSize, maxSize));
		chooseFunc.add(options);
		chooseFunc.add(new Box.Filler(minSize, prefSize, maxSize));

		
		// the actual prime finder/checker
		
		JPanel singlePrimeFunc = new JPanel();
		singlePrimeFunc.setLayout(new BoxLayout(singlePrimeFunc, BoxLayout.Y_AXIS));
		singlePrimeFunc.setBackground(Color.lightGray);
		
		JLabel description = new JLabel("Enter any number to check for prime:");
		description.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		
		singlePrimeFunc.add(description);
//		JButton button2 = new JButton("Main things happen here");
//		button2.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		
		
		// add all elements into program layout
		window.add(panel);
		panel.add(title, BorderLayout.NORTH);
		panel.add(chooseFunc, BorderLayout.EAST);
		panel.add(singlePrimeFunc, BorderLayout.CENTER);
		
		window.setSize(1280, 720);
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FirstGUIApplication();
	}
}
