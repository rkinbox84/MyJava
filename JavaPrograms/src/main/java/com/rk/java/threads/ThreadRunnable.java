package com.rk.java.threads;

public class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
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
	
	
	public static void main(String args[]) {
		
		Runnable r = new ThreadRunnable();
		Thread t = new Thread(r);
		
		t.start();
		
		System.out.println("Program ends !!!");
	}
	

}
