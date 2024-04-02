package com.javapackage;

public class firstThread {

	public static void main(String[] args) {
		Student s=new Student("Thread1");
		s.start();
		manager m=new manager("Thread2");
		m.start();
		System.out.println(Thread.activeCount());
	}
}
class Student extends Thread{

	public Student(String t1name) { //we can change by using or calling the thread class constructor
		super(t1name);
	}
	public void run() {
		System.out.println("Hello I am a student"+" "+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
	}
}
class manager extends Thread{
	public manager(String t2name) {
		super(t2name);
	}
	public void run() {
		System.out.println("Hi Iam a manager"+" "+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
	}
}
