package com.rk.java.stringspkg;

public class StringPermutation {


		public static void main(String[] args) {
		    String  a = "abcd";
		  per(a, 0);

		}

		static void per(String a  , int start ) {
		      //bse case;
		    if(a.length() == start) {System.out.println(a);}
		    char[] ca = a.toCharArray();
		    //swap 
		    for (int i = start; i < ca.length; i++) {
		        char t = ca[i];
		        ca[i] = ca[start];
		        ca[start] = t;
		        per(new String(ca),start+1);
		    }

		}//per

}
