package Chapter6;

import java.awt.*;
//import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class PrimeNumberApp
{	
	
	private JFrame window;
	private JPanel panel;
	private JPanel choosePanel;
	private JPanel singlePrimePanel;
	private JPanel singlePrimePanelPanel;
	private JPanel rangePrimeFunc;
	private GroupLayout singlePrimeLayout;
	
	private JLabel title;
	private JLabel description;
	private JTextField input;
	private JTextArea output;
	private JList options;
	
	private Dimension minSize, maxSize, prefSize;
	
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
		
		singlePrimePanel = new JPanel();
		singlePrimePanelPanel = new JPanel(new FlowLayout());
		singlePrimeLayout = new GroupLayout(singlePrimePanel);
		singlePrimeLayout.setAutoCreateGaps(true);
		singlePrimeLayout.setAutoCreateContainerGaps(true);
		
		minSize = new Dimension(25, 100);
		prefSize = new Dimension(100, 100);
		maxSize = new Dimension(Short.MAX_VALUE, 100);
		
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
		
		choosePanel.add(new Box.Filler(minSize, prefSize, maxSize));
		choosePanel.add(options);
		choosePanel.add(new Box.Filler(minSize, prefSize, maxSize));

		
		// the actual prime finder/checker
		singlePrimePanel.setLayout(singlePrimeLayout);
		singlePrimePanel.setBackground(Color.lightGray);
		singlePrimePanelPanel.setBackground(Color.lightGray);
		
		description = new JLabel("Enter any number to check for prime:");
		description.setFont(regular);
		
		input = new JTextField();
		
		singlePrimeLayout.setHorizontalGroup
		(
			singlePrimeLayout.createParallelGroup(GroupLayout.Alignment.CENTER, false)
			.addComponent(description, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addComponent(input, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		
		singlePrimeLayout.setVerticalGroup
		(
			singlePrimeLayout.createSequentialGroup()
			.addComponent(description, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                    GroupLayout.DEFAULT_SIZE, 20)
			.addComponent(input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);
		
		singlePrimePanelPanel.add(singlePrimePanel);
		
		
		// add all elements into program layout
		window.add(panel);
		panel.add(title, BorderLayout.NORTH);
		panel.add(choosePanel, BorderLayout.EAST);
		panel.add(singlePrimePanelPanel, BorderLayout.CENTER);
		
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
