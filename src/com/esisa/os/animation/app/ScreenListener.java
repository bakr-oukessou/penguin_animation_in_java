package com.esisa.os.animation.app;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class ScreenListener implements MouseListener{
	private Screen screen;
	public ScreenListener(Screen screen) {
		this.screen= screen;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		screen.newPenguin(e.getX(), e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}
