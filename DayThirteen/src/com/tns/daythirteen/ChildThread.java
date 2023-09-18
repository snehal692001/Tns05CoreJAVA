package com.tns.daythirteen;

public class ChildThread extends Thread{
	public void run()
	{
		System.out.println("This is a task of child thread...");
		
		//System.out.println("");
		ThreadDemo.printHello();
		
	}
	
	public static void main(String[] args) {
		System.out.println("In main "+Thread.currentThread());
		//printodd();
		ChildThread t1=new ChildThread();
		t1.start();
		ChildThread t2=new ChildThread();
		t2.start();
		ChildThread t3=new ChildThread();
		t3.start();
		
	}

}
