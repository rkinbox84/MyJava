package com.rk.java.ivproblems;

import java.util.Stack;

public class NextBigElementInarray {

	//Algo : https://www.youtube.com/watch?v=uFso48YRRao
	// Use stack.
	/**
	 * 1. Push first element in to stack
	 * 2. If next incoming element bigger than stack.peek. Pop the element.
	 * 3. continue the step no 2 until no more big element than incomming element
	 * 4. later push the incomming element
	 * 5. continue the process until the last element of the array
	 * 6. Print remaining elements in the stack for those no bigger element found after
	 */
	
	
	public static void main(String[] args) {
		
		int[] inpArray = {5,3,2,10,6,8,1,4,1,2,7,4};
		
		findNxtBigElem(inpArray);
	}
	
	
	public static void findNxtBigElem(int[] inpA) {
		
		
		if(inpA==null || inpA.length == 0) {
			return;
			
		}
		
		Stack<Integer> numStack = new Stack<Integer>();
		
		
		for(int i=0; i < inpA.length; i++) {
			
			if(i==0) {
				numStack.push(inpA[i]);
				continue;
			}
			
			//if(!numStack.isEmpty() && inpA[i] > numStack.peek()) {
				while(!numStack.isEmpty() && inpA[i] > numStack.peek()) {
					System.out.println("Nxt Big Element for "+ numStack.peek() + "is" +inpA[i] );
					
					numStack.pop();

				}
				
			//}
			
			numStack.push(inpA[i]);
			
		}
		
		while(!numStack.isEmpty()) {
			System.out.println("No Big Element for "+ numStack.pop());
			
		}
	}
}

