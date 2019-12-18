package com.rk.java.arrays;

public class RemoveDuplicates {

	public static void main(String args[]) {
		
		char inp[] = {'a','c','s','a','s','z'};
		
		//String x = new String(inp);
		
		//System.out.println(x);
		
		//sol1(inp);
		sol2(inp);
		
	}
	
	public static void sol1(char inp[]) {
		
		char res[] = new char[inp.length];
		int k=0,flag=0;
		
		for(int i=0; i<inp.length;i++) {
			
			for(int j=0; j<inp.length;j++) {
				
				if(inp[i]==res[j]) {
					flag=0;
					break;
				}
				
				flag=1;
			}
			
			if(flag==1) {
				res[k] = inp[i];
				k++;
			}

		}
		
		for(char a : res) {
			System.out.println(a);
		}
		
	}
	

	
	public static void sol2(char inp[]) {
		
		char res[] = new char[inp.length];
		
		int j=0;
		for(int i=0; i<inp.length;i++) {
			String resStr = new String(res);
			char val = inp[i];
			int pos = resStr.indexOf(inp[i]);
			
			if(pos == -1) {
				res[j] = inp[i];
				j++;
			}
		
			System.out.println(pos);

	}
	}
}
