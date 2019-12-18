package com.rk.java.datastructure.stack;

public class MyStack {
	
	public static void main(String[] args) {
		
		Stack st = new Stack(3);
		
		st.push(1);
		
		st.push(2);

		st.push(3);

		st.push(4);
		st.display();
		
		st.pop();
		st.display();

		st.pop();
		st.display();
		
		st.pop();
		st.display();
		
	}
	

}

class Stack {
	
	int[] stk;
	
	int size;
	int stkPointer=0;
	
	Stack(int stkSize){
		
		this.size = stkSize;
		stk = new int[size];
	}
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}

	public void push(int data) {
		if(stkPointer < size) {
			stk[stkPointer++] = data;

		}else {
			System.out.println("The stack is Full!!");
			stkPointer--;
		}
		
	}
	
	public void pop() {
		
		if(stkPointer >= size) {
			stkPointer--;
		}
		if(stkPointer > -1) {
			
			System.out.println("The Popped data"+ stk[stkPointer--]);

		}else {
			System.out.println("The stack is Empty!!");
		}
	}
	
	public boolean isFull() {
		
		if(size==stkPointer) {
			return true;
		}
		return false;
		
	}
	
	public boolean isEmpty() {
		if(stkPointer==-1) {
			return true;
		}
		return false;
	}
	
	public void display() {
		
		if(stkPointer == -1) {
			System.out.println("The stack is Empty!!");
		}else {
		for(int i=stkPointer; i>=0; i--) {
			System.out.print(stk[i]+ " ");
		}
		}
	}
}
