package com.esisa.os.animation;

public class Task implements Runnable{
	private Thread runner;
	public Task(String name) {
		runner= new Thread(this,name);
	}
	
	//delegate Method
	public void start() {
		runner.start();
	}
	
	@Override
	public void run() {
		
	}
}
