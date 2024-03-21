package com.esisa.os.animation.app;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation extends JFrame {
	private static final long serialVersionUID = 1L;
	private Screen screen;
	private int width=1000,height=500;
	
	public Animation() {
		JPanel root = new JPanel();
		root.setLayout(new BorderLayout());
		JButton b1 = new JButton("Quitter");
		b1.addActionListener(new ExitAction());
		root.add("South",b1);
		
		screen= new Screen(width,height);
		screen.setBackground(Color.BLACK);
		screen.setLayout(null);
		screen.addMouseListener(new ScreenListener(screen));
		root.add("Center",screen);
		
		
		setContentPane(screen);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	
	
	public static void main(String[] args) {
		new Animation();

	}
}
