package com.rk.java.ivproblems;

import java.math.BigInteger;

public class TestClass {

	    public static void main(String[] args)  {

	    	System.out.println(FindBigNum(3));
	    	
	    }

	    static long FindBigNum(long n) {
	        // Write your code here
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i=1; i<=n; i++) {
	            
	            sb.append(getBinary(i));
	        }
	        
	        long res = getDecimal(sb.toString()) % 1000000007;
	        
	        return res;
	        
	        //return getDecimal(sb.toString());

	    }
	    
	    static String getBinary(int num){
	        return Integer.toBinaryString(num);
	        
	    }
	    
	    static int getDecimal(String bin) {
	        return Integer.parseInt(bin,2);  
	    }
	    
	    static int getBinaryLength(int num){
	        return Integer.toBinaryString(num).length();
	        
	    }
	    
	    static long FindDec(int n){
	        int currentValueSize = 0;
	        BigInteger currentValue= BigInteger.ZERO;

	        for(int i=1;i<=n;i++){

	            //currentValueSize = getBinaryLength(i);
	            currentValue = currentValue.shiftLeft(currentValueSize).add(new BigInteger(""+i));
	        }
	        return currentValue.mod(new BigInteger("1000000007")).longValue();
	    }
	}


