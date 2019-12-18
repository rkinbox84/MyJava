package com.rk.java.stringspkg;

import java.util.Scanner;

public class SplitOddEvenChar {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

	      int count = sc.nextInt();
	      sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	      for(int i=0;i<count;i++){
	          String odd="";
	          String even="";
	          
	          String input = sc.nextLine();
	          char[] inpAry = input.toCharArray();

	          for(int j=0 ; j<inpAry.length; j++){
	              if(j%2 == 0){
	                  even=even+inpAry[j];

	              }else {
	                  odd=odd+inpAry[j];
	              }
	          }

	          System.out.println(even+" "+odd);
	      }
		
	}
	
	
	
	  
}
