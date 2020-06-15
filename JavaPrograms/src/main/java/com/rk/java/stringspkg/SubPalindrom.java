package com.rk.java.stringspkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Integer.parseInt("a"));
		//System.out.println(palindrome("abcddcbabcdcdaadcdcbabcdddcb"));
		
		//System.out.println(isPalindrom("aabaad"));
	}
	
	
	public static int palindrome(String s) {
	    // Write your code here

		
		Set<String> chrSet = new HashSet<String>();
		List<String> strList = new ArrayList<String>();
	
		for(int i=0; i<s.length();i++) {
			chrSet.add(Character.toString(s.charAt(i)));
		}
		
		int pCount=0;
	      
		int start=0;
		int end=0;
		for(int i=1; i<s.length();i++) {
			
			start=0;
			end=i;
			while(start<s.length() && end < s.length()) {
				//System.out.println(s.substring(start,end+1));
				//strSet.add(s.substring(start,end+1));
				strList.add(s.substring(start,end+1));
				start++;
				end++;
			}
			
			
		}
		
		
		for(String val:strList) {
			
			if(isPalindrom(val)) {
				pCount++;
			}
		}
		
		return pCount+chrSet.size();

	}
	
	public static boolean isPalindrom(String s) {
		
		int i =0;
		int j=s.length()-1;
		
		if(s.length()==1) {
			return true;
		}
		
		while(i<s.length() && j> 0 && i!= j && s.charAt(i)==s.charAt(j)) {
			i++;
			j--;
			
		}
		

		
		return (i==j) ? true:false;
		
	}

}
