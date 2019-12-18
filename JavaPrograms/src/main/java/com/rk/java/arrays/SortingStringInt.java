package com.rk.java.arrays;

import java.util.Arrays;

public class SortingStringInt {

	public static void main(String args[]) {
		
		char[] myChrArray = {'z','e','k','a'};
		int[] myIntArray = {7,4,8,1,6,3};
		
		sortChar(myChrArray);
		
		sortInt(myIntArray);
		
	}
	
	public static void sortChar(char[] charArray) {
		
		for(int i=0; i< charArray.length; i++) {
			for(int j=i+1; j<charArray.length; j++) {
				if(charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
				
			}
		}
		
		System.out.println(charArray);
		
	}
	
	public static void sortInt(int[] intArray) {
		
		for(int i=0; i< intArray.length; i++) {
			for(int j=i+1; j<intArray.length; j++) {
				if(intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(intArray));
	}
}
