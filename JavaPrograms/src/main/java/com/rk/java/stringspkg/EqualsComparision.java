package com.rk.java.stringspkg;

public class EqualsComparision {

	public static void main(String args[]) {
		
		String s1="abc";
		String s2="abc";
		
		String s3= new String("xyz");
		String s4= new String("xyz");
		
		if(s1==s2) {
			System.out.println("S1 and S2 ponts same memory");
		}else {
			System.out.println("S1 and S2 ponts diff memory");
		}
		
		if(s3==s4) {
			System.out.println("S3 and S4 ponts same memory");
		}else {
			System.out.println("S3 and S4 ponts diff memory");
		}
		
		if(s1.equals(s2)) {
			System.out.println("S1 and S2 Same data");
		}else {
			System.out.println("S1 and S2  diff data");
		}
		
		if(s3.equals(s4)) {
			System.out.println("S3 and S4 same data");
		}else {
			System.out.println("S3 and S4  diff data");
		}
		
	}
}
