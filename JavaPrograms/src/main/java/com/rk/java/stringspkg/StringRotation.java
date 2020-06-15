package com.rk.java.stringspkg;

public class StringRotation {

	public static void main(String args[]) {
		
		int val = StringRotation.totalTurns("abcabc", 1, 1);
		
		System.out.println(val);
	}
	
	
	public static int totalTurns(String input1,int input2, int input3) {
		
		String rotateString = null;
		int count=0;
		
		while(!input1.equals(rotateString)) {
			
			if(rotateString==null) {
				rotateString = input1.substring(input2) + input1.substring(0,input2);
				count++;
				
				rotateString = rotateString.substring(input3) + rotateString.substring(0,input3);
				count++;
			}else {
				rotateString = rotateString.substring(input2) + rotateString.substring(0,input2);
				count++;
				rotateString = rotateString.substring(input3) + rotateString.substring(0,input3);
				count++;
			}
			
		}
		
		return count;
	}
}
