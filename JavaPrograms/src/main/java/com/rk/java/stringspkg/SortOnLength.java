package com.rk.java.stringspkg;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortOnLength {
	
	// Function to print the sorted array of string 
	// void printArraystring(string,int); 
	  
	// Function to Sort the array of string 
	// according to lengths. This function  
	// implements Insertion Sort.  
	static void sort(String []s, int n) 
	{ 
	    for (int i=1 ;i<n; i++) 
	    { 
	        String temp = s[i]; 
	  
	        // Insert s[j] at its correct position 
	        int j = i - 1; 
	        while (j >= 0 && temp.length() < s[j].length()) 
	        { 
	            s[j+1] = s[j]; 
	            j--; 
	        } 
	        s[j+1] = temp; 
	    } 
	} 
	
	
	static void treeMap(String str[]) {
		
		Map<Integer,String> tMap = new TreeMap<Integer, String>();
		
		for(int i=0; i< str.length; i++) {
			
			tMap.put(str[i].length(), str[i]);
			
		}
		
		String[] sStr = new String[str.length];
		
		int j=0;
		for(Entry e: tMap.entrySet()) {
			
		
			sStr[j++] = (String) e.getValue();
		}
		
		printArraystring(sStr, sStr.length);
		
		
	}
	  
	// Function to print the sorted array of string 
	static void printArraystring(String str[], int n) 
	{ 
	    for (int i=0; i<n; i++) 
	        System.out.print(str[i]+" "); 
	} 
	  
	// Driver function 
	public static void main(String args[]) 
	{ 
	    String []arr = {"GeeksforGeeks", "I", "from", "am"}; 
	    int n = arr.length; 
	      
	    // Function to perform sorting 
	    //sort(arr,n);
	    
	    treeMap(arr);
	    
	    // Calling the function to print result 
	    //printArraystring(arr, n); 
	      
	} 

}
