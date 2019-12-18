package com.rk.java.arrays;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String args[]) {
		
		int[] inp = {1,2,3,5};
		
		
		
		pintMissing(inp, 5);
		
	}
	
	public static void pintMissing(int[] inp, int max) {
		
		String inpStr = Arrays.toString(inp);
		
		System.out.println(inpStr);
		
		System.out.println("Index:"+ inpStr.indexOf(Integer.toString(1)));
		
		for(int i=1; i<=max;i++) {
			if(inpStr.indexOf(Integer.toString(i))==-1) {
				System.out.println("Missing Number: "+ i);
			}
		}
		
	}
}
