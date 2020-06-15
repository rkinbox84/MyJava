package com.rk.java.leetcode;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		System.out.println(PalindromNumber.isPalindrome(121));
	}
	
	 public static boolean isPalindrome(int x) {
	        
	        int rev =0;
	        if(x<0){
	            return false;
	        }
	        
	        while(x!=0){
	            
	            int rem = x %10;
	            x = x/10;
	            
	            rev = rev*10 + rem;
	        }
	        
	        if(rev == x) {
	            return true;
	        }
	        
	        System.out.println(rev);
	        return false;
	    }

}
