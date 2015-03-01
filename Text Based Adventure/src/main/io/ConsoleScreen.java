package main.io;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * 
 * @author Adam Crick
 * @version 0.0.1:1
 * 
 * Class that contains all methods and stuff for the console screen, which is accessed by the main game.
 * 
 */


public class ConsoleScreen implements KeyListener{
	
	private JFrame frame;
	private JPanel panel;
	private JTextArea mainTextArea;
	private JTextArea sideTextArea;
	private JTextField inputArea;
	private int screenWidth, screenHeight;
	
	
	/**
	 * Constructor for the console screen, creates it, derp
	 * 
	 * @param name
	 * @param screenWidth
	 * @param screenHeight
	 */
	public ConsoleScreen(String name, int screenWidth, int screenHeight){
		
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		
		frame = new JFrame(name);
		frame.setSize(screenWidth, screenHeight);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		panel = new JPanel(new BorderLayout());
		frame.add(panel);
		initLayout();
	}
	
	/**
	 * Creates and arranges the JComponents to fit inside of the frame.
	 */
	private void initLayout(){
		mainTextArea = new JTextArea(80, 80);
		sideTextArea = new JTextArea(80, 33);
		inputArea = new JTextField(30);
		panel.add(mainTextArea, BorderLayout.WEST);
		panel.add(sideTextArea, BorderLayout.EAST);
		panel.add(inputArea, BorderLayout.SOUTH);
		panel.setBackground(Color.GRAY);
		
		mainTextArea.setEditable(false);
		mainTextArea.setFont(new Font("monospaced", Font.PLAIN, 14));
		mainTextArea.setLineWrap(false);
		mainTextArea.setBackground(Color.BLACK);
		mainTextArea.setForeground(Color.WHITE);
		
		sideTextArea.setEditable(false);
		sideTextArea.setFont(new Font("monospaced", Font.ITALIC, 12));
		sideTextArea.setLineWrap(false);
		sideTextArea.setBackground(Color.GRAY);
		sideTextArea.setText("INPUT HISTORY");
		
		inputArea.setName("INPUT AREA");
		inputArea.setFont(new Font("monospaced", Font.PLAIN, 12));
		inputArea.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			sideTextArea.append("\n" + inputArea.getText());
			System.out.println("TEXT ADDED: " + inputArea.getText());
			inputArea.setText("");
		}
	}
	
	public void keyReleased(KeyEvent e){
		//NOTHING
	}
	
	public void setTextImage(String text){
		mainTextArea.setText(text);
	}

	public void keyTyped(KeyEvent arg0) {
		//NOTHING
	}

}
