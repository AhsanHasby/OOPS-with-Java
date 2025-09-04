package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {
	JScrollPane scrollPane;
	JTextArea textArea;
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenuItem openItem, exitItem;
	JPanel radioPanel;
	JRadioButton yesButton, noButton;
	
	
	TextEditor(){
		setTitle("Text Editor");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		openItem = new JMenuItem("Open");
		exitItem = new JMenuItem("Exit");
		fileMenu.add(openItem);
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		
		yesButton = new JRadioButton("Yes");
		noButton = new JRadioButton("No");
		ButtonGroup group = new ButtonGroup();
		group.add(yesButton);
		group.add(noButton);
		
		radioPanel = new JPanel();
		radioPanel.add(yesButton);
		radioPanel.add(noButton);

		add(scrollPane, BorderLayout.CENTER);
		add(radioPanel, BorderLayout.SOUTH);

		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}

		});
		
	}

	public static void main(String args[]){
		TextEditor editor = new TextEditor();
		editor.setVisible(true);
	}

}