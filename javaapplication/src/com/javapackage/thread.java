package com.javapackage;

public class thread {

	public static void main(String[] args) {
		System.out.println("Hello guys this is concept of multithreading");
		String res=Thread.currentThread().getName(); //this method will returns the String so store in String type
		System.out.println(res); 
		//by default in java we have one main thread;
		int res1=Thread.activeCount(); //by default we have only 1 thread that why it returns activecount as 1
		System.out.println(res1);
		long Id=Thread.currentThread().getId();
		System.out.println(Id);
		//Thread.currentThread.getname
		//Thread.currentThread.getid
	
	}

}
