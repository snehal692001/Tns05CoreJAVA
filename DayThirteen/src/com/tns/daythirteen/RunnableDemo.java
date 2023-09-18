package com.tns.daythirteen;

public class RunnableDemo {

	public static void main(String[] args) {
		Runnable implObj = new Runnable(implObj) 
		Thread threadOne=new Thread((Runnable) implObj);
		
		threadOne.start();
		
		
		Runnable obj=new Runnable() {

			@Override
			public void run() {
				char ch='a';
				for(int i=1; i<26;i++,ch++)
					System.out.print(ch+"\t");
				
				
			}
			
		};
		Thread threadTwo=new Thread(implObj);
		threadTwo.start();
		Runnable object=()->
		{
			for(int i=1; i<=100; i+=2) 
				System.out.print(i+"\t");
	
		

	};

}
}
