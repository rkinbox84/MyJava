package com.rk.java.threads;

public class MyThread extends Thread{
	
	Printer p1;
	
	MyThread(){
		p1= new Printer();
	}

	public static void main(String args[]) {
		
		MyThread t1 = new MyThread();
		
		Printer p1 = new Printer();
		
		t1.start();
		
	}
	
	@Override
	public void run() {
		
	}
}

class Printer{
	
	Printer(){
		
	}
	
	public void print(int copies, String  docName) {
		
		for(int i=0; i<copies; i++) {
			System.out.println("Printing Document" + docName + "Copy :"+ i );
		}
		
	}
}