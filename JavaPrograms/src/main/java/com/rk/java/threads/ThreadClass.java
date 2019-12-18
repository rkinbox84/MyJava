package com.rk.java.threads;

public class ThreadClass extends Thread{
	
	public static void main(String[] args) {

		Thread t = new ThreadClass();
		
		t.start();
		
		System.out.println("Program ends !!!");
	}

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			try {
				
				System.out.println("Running thread"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
