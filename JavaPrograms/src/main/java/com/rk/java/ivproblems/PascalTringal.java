package com.rk.java.ivproblems;

public class PascalTringal {

	public static void main(String[] args) {
		
		PascalTringal pt = new PascalTringal();
		
		pt.printPascalTriangle(10);
		
	}
	
	
	protected void printPascalTriangle(int size) {
		
		
		int[][] pTgl = new int[size][size];
		
		for(int line=0; line<size; line++) {
			
			//pTgl[line+1] = new int[line+1];
			
			for(int col=0; col<line; col++) {
				
				if(col==0||line==col) {
					pTgl[line][col] = 1;
				}else {
					pTgl[line][col] = pTgl[line-1][col-1] + pTgl[line-1][col];
					
					
				}
				System.out.print(pTgl[line][col]);
				
			}
			
			System.out.println(""); 
			
		}
		
	}
}
