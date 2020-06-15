package com.rk.java.ivproblems;

import java.util.Scanner;

public class TestHE {

	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();                 // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        */

	        // Write your code here
	        Scanner s = new Scanner(System.in);
	        int tc = s.nextInt();

	        int[] inputs = new int[tc];

	        for(int i=0; i<tc; i++){
	            inputs[i] = s.nextInt();
	        }

	        for(int i=0; i<=tc; i++){
	            printFizzBuzz(inputs[i]);
	        }

	    }

	    public static void printFizzBuzz(int range) {

	        for(int i=1; i<= range; i++) {

	            if((i%3) == 0 && (i%5) == 0) {
	                System.out.println("FizzBuzz");
	            }else if((i%3) == 0) {
	                System.out.println("Fizz");
	            }else if((i%5) == 0) {
	                System.out.println("Buzz");
	            }else {
	                System.out.println(i);
	            }

	        }
	    }
	


}
