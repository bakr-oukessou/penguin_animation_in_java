package com.esisa.os.animation.app;

public class Util {
	public Util() {
		// TODO Auto-generated constructor stub
	}
	public static void print(String message) {
		System.out.println(">"+message+", par :"+Thread.currentThread().getName());
	}
	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
