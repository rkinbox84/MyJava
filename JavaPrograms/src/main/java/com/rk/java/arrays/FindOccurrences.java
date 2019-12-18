package com.rk.java.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class FindOccurrences {



	public static void main(String args[]) {
		
		int[] inp = {1,2,3,5,1,2,3,4,4,4,8};
		
		
		
		printOccurrences(inp);
		
	}
	
	public static void printOccurrences(int[] inp) {
		
		HashMap<Integer,Integer> occur= new HashMap<Integer,Integer>();
		
		for(int i=0;i<inp.length;i++) {
			int count=0;
			for(int j=0; j<inp.length;j++) {
				
				if(inp[i]==inp[j]) {
					count++;
				}
				
			}
			occur.put(inp[i], count);
			
			
		}
		
		for(int k: occur.keySet()) {
			System.out.println(k+"==>"+ occur.get(k));
			
		}
		
	}

}
