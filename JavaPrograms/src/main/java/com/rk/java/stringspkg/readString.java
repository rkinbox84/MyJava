package com.rk.java.stringspkg;

import java.util.Scanner;

public class readString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		readString.readStr();

	}
	
	public static void readStr() {int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
	
    Scanner scan = new Scanner(System.in);

    
    /* Declare second integer, double, and String variables. */
    int j ;
    double e ;
    String t;

    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
     
    j = scan.nextInt();

     e = scan.nextDouble();
     scan.nextLine();
     t = scan.nextLine();
     

     char[] strAry = t.toCharArray();
     strAry.length

    /* Print the sum of both integer variables on a new line. */

    System.out.println(i+j);

    /* Print the sum of the double variables on a new line. */
	System.out.println(d+e);
    /* Concatenate and print the String variables on a new line; 
    	the 's' variable above should be printed first. */

    System.out.println(t);
    scan.close();}

	public static void readString() {
		
		Scanner in = new Scanner(System.in);
		String input;
		int count=1;
		
		
		
		input = in.nextLine();
		
		while(!input.contains("end-of-file.")){
			
			
			System.out.println(count+" "+ input);
			count++;
			input = in.nextLine();
			
		}
		System.out.print(count+" "+ input);
		
	}
}
