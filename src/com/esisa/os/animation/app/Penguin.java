package com.esisa.os.animation.app;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static com.esisa.os.animation.app.Util.*;

public class Penguin extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	
	private Thread runner;
	
	private String path = "resources/a01";
	private String type = ".gif";
	private String src[]= {
			"stop","right1","right2","right3","left1","left2","left3"
	};
	private int x,y, width=30,height=30;
	private int step = 5;
	
	private Image sequence[];
	private int current=0;
	private Screen screen;
	
	public Penguin(String name,int x , int y,Screen screen) {
		runner = new Thread(this,name);
		this.x=x;
		this.y=y;
		this.screen = screen;
		setLocation(x, y);
		setSize(width, height);
		loadImages();
		
		setToolTipText(name);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	private void loadImages() {
		sequence = new Image[src.length];
		
		for (int i = 0; i < sequence.length; i++) {
			ImageIcon icon = new ImageIcon(path+"/"+src[i]+type);
			sequence[i]= icon.getImage();
		}
	}

	public void start() {
		runner.start();
	}

	@Override
	public void run() {
		do {
			double action = Math.random()*100;
			if(action<45) {
				goRight(3);
			}else if(action<90) {
				goLeft(3);
			}else
				Stop();
			if (x==40) {
				goRight(5);
			}
			
		} while (true);
		
	}
	private void goRight(int count) {
		for (int j = 0; j < count; j++) {
			for (int i = 1; i <= 3; i++) {
				current=i;
				x+=step;
				setLocation(x, y);
				
				repaint();
				pause(100);
			}
		}
	}
	private void goLeft(int count) {
		for (int j = 0; j < count; j++) {
			for (int i = 4; i <= 6; i++) {
				current=i;
				x-=step;
				setLocation(x, y);
				repaint();
				pause(100);
			}
		}
	}
	private void Stop() {
		current = 0;
		repaint();
		pause((int)Math.random()*2000+1000);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(sequence[current], 0, 0, null);
	}
}
