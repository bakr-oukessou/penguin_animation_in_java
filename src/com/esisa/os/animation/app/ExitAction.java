package com.esisa.os.animation.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Ecouteur d'evenement 
 */

public class ExitAction implements ActionListener{

	public ExitAction() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed()");
		System.exit(0);
	}

}
