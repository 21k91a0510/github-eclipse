package com.javapackage;

public class firstrunnable {

	public static void main(String[] args) {
		
		student s=new student();
		s.start();
		
	}
}
class student extends Thread{

	@Override
	public void run() {
		System.out.println("Hello student implements the Runnable run");
		
	}
	
}