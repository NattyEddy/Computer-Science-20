package Chapter6;

import java.awt.Font;

import javax.swing.*;

public class FirstGUIApplication
{
	public FirstGUIApplication()
	{
		JFrame window = new JFrame("Hello World!");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		BoxLayout ux = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(ux);
		
		JTextArea edit = new JTextArea("Edit this text...");
		edit.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		
		JLabel words = new JLabel("Hello World!");
		words.setFont(new Font("Comic Sans MS", Font.BOLD, 72));
		words.setHorizontalAlignment(JLabel.CENTER);
		
		window.add(panel);
		panel.add(words);
		panel.add(edit);
		
		window.setSize(1280, 720);
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FirstGUIApplication();
	}
}
