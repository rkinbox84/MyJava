package com.rk.java.stringspkg;

public class StringPermutation {

		public static void main(String[] args) {
		    String  a = "ab";
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
				
				String sbs1 = val.substring(0,i);
				String sbs2 = val.substring(i+1,strLength);
				
				strPermutation(prefix+val.charAt(i), sbs1+sbs2);
				
			}
		}
		
		
		public void permutation(String str) {
			
			strPermutation("", str);
		}


}
