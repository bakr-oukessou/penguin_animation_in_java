package com.esisa.os.animation.app;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;

public class Screen extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private List<Penguin> list;
	private int width, height;
	
	public Screen(int width,int height) {
		setBackground(Color.BLACK);
		setLayout(null);
		addMouseListener(new ScreenListener(this));
		this.width=width;
		this.height =  height;
		
		list = new Vector<Penguin>();

	}
	public Penguin newPenguin(int x, int y) {
		
		Penguin p = new Penguin("omar"+list.size(), x, y,this);
		add(p);
		list.add(p);
		p.start();
		return p ; 
		
	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(width,height);
	}
}
