package com.rk.java.stringspkg;

public class StringPermutation {

		public static void main(String[] args) {
		    String  a = "abc";
		  //per(a, 0);
		    
		    StringPermutation per = new StringPermutation();
		    
		    per.permutation(a);

		}
		
		
		public void strPermutation(String prefix, String val) {
			
			int strLength = val.length();
			
			if(strLength == 0) {
				System.out.println(prefix);
				return;
			}
			
			for(int i=0; i<val.length(); i++) {
				
				strPermutation(prefix+val.charAt(i), val.substring(0,i)+val.substring(i+1,strLength));
				
			}
		}
		
		
		public void permutation(String str) {
			
			strPermutation("", str);
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
