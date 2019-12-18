package com.rk.java.threads;

import java.util.LinkedList;

public class MyPCSol {
	
	public static void main(String[] args) throws InterruptedException {
		
		final PC pc = new PC(); 
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}


class PC {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	int capacity =2;
	int data=0;
	

	public synchronized void producer() throws InterruptedException {
		
		
		
		while(true) {
			
			if(list.size() == capacity) {
				//wait if the capacity is full
				wait();
			}else {
				list.add(data++);
				System.out.println("Producer produced-"
                        + data); 
				
				notify();
				
				Thread.sleep(100);

				
			}
			
		}
		
	}
	
	public synchronized void consumer() throws InterruptedException {
		
		while(true) {
			
			if(list.size() == 0) {
				wait();
			}else {
				int val = list.removeFirst();
				
				System.out.println("Consumer Consumed-"+ val);
				
				notify();
				
				Thread.sleep(100);
			}
			
		}
		
	}
}