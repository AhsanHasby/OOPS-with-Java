package TextEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicTextEditor extends JFrame {
    private JTextArea textArea;
    private JRadioButton yesRadio;
    private JRadioButton noRadio;

    public BasicTextEditor() {
        setTitle("Basic Text Editor");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Text area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Radio buttons
        yesRadio = new JRadioButton("Yes");
        noRadio = new JRadioButton("No");
        ButtonGroup group = new ButtonGroup();
        group.add(yesRadio);
        group.add(noRadio);

        JPanel radioPanel = new JPanel();
        radioPanel.add(yesRadio);
        radioPanel.add(noRadio);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(closeItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // Add components to frame
        add(scrollPane, BorderLayout.CENTER);
        add(radioPanel, BorderLayout.SOUTH);

        // Action listeners without lambda - anonymous inner classes
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(BasicTextEditor.this, "Open selected (not implemented)");
            }
        });

        closeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                group.clearSelection();
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(BasicTextEditor.this, "Save selected (not implemented)");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(BasicTextEditor.this, "Basic Text Editor v1.0\nCreated by ChaterBal");
            }
        });
    }

    public static void main(String[] args) {
        BasicTextEditor editor = new BasicTextEditor();
        editor.setVisible(true);
    }
}
