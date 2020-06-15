package com.rk.java.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ascStackIV {
	

	public static int sorted(String a)
	{
		// complete the function!
		
			//complete the function!
	int delCnt=0;
	char[] chArry = a.toCharArray();
	
	Stack<Character> chrStk = new Stack<Character>();
	
	for(int i=0; i< chArry.length; i++){
	    
	    if(i==0){
	       chrStk.push(chArry[i]); 
	       
	    }else if(!chrStk.isEmpty()&& chArry[i] > chrStk.peek()){
	        chrStk.push(chArry[i]); 
	    }else if(i == chArry.length && !chrStk.isEmpty()&& chArry[i] < chrStk.peek()){
	        delCnt++;
	    }else{
	        while(!chrStk.isEmpty() && chArry[i] < chrStk.peek() ){
	            chrStk.pop();
	            delCnt++;
	        }
	        chrStk.push(chArry[i]);  
	    }
	}
	return delCnt;
	}
 
	public static void main (String[] args) throws IOException,java.lang.NumberFormatException
	{
	    int t;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		t =Integer.parseInt(input.readLine());

        
		while(t > 0)
		{
			String a = input.readLine();
			int ans = sorted(a);
			System.out.println(ans);
			t--;
		}
	}


}
