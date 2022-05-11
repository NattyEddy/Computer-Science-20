package Chapter6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class PrimeNumberApp
{	
	
	private JFrame window;
	private JPanel panel;
	private JPanel choosePanel;
	private JPanel singlePrimePanel;
	private JPanel rangePrimeFunc;
	
	private JLabel title;
	private JLabel description;
	private JTextField input;
	private JList options;
	
	private Dimension minSize, maxSize, prefSize;
	private Box.Filler left, right;
	
	private Font header;
	private Font header2;
	private Font regular;
	
	private String[] choices = {"Single", "Range"};
	
	public PrimeNumberApp()
	{
		
		window = new JFrame("Prime Finder");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		minSize = new Dimension(25, 100);
		prefSize = new Dimension(100, 100);
		maxSize = new Dimension(Short.MAX_VALUE, 100);
		left = new Box.Filler(minSize, prefSize, maxSize);
		right = new Box.Filler(minSize, prefSize, maxSize);
		
		header = new Font("Comic Sans MS", Font.BOLD, 72);
		header2 = new Font("Comic Sans MS", Font.BOLD, 36);
		regular = new Font("Comic Sans MS", Font.BOLD, 24);
		
		
		// title element
		title = new JLabel("Prime Finder");
		title.setFont(header);
		title.setHorizontalAlignment(JLabel.CENTER);
		
		
		// prime finder type select
		choosePanel = new JPanel();
		choosePanel.setLayout(new BoxLayout(choosePanel, BoxLayout.X_AXIS));
		choosePanel.setBackground(Color.gray);
		
		options = new JList(choices);
		options.setSelectedIndex(0);
		options.setFont(regular);
		
		choosePanel.add(left);
		choosePanel.add(options);
		choosePanel.add(right);

		
		// the actual prime finder/checker
		singlePrimePanel = new JPanel();
		singlePrimePanel.setLayout(new BoxLayout(singlePrimePanel, BoxLayout.Y_AXIS));
		singlePrimePanel.setBackground(Color.lightGray);
		
		description = new JLabel("Enter any number to check for prime:");
		description.setFont(header2);
		
		input = new JTextField();

		singlePrimePanel.add(left);
		singlePrimePanel.add(description);
		singlePrimePanel.add(input);
		singlePrimePanel.add(right);
		
		
		
		// add all elements into program layout
		window.add(panel);
		panel.add(title, BorderLayout.NORTH);
		panel.add(choosePanel, BorderLayout.EAST);
		panel.add(singlePrimePanel, BorderLayout.CENTER);
		
	}
	
	
	public void launch()
	{
		
		window.setSize(1280, 720);
		window.setVisible(true);
	
	}
	
	public static void main(String[] args)
	{
		PrimeNumberApp app = new PrimeNumberApp();
		app.launch();
	}
}
