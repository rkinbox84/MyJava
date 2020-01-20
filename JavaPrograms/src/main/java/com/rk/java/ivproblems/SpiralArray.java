
package com.rk.java.ivproblems;

public class SpiralArray {
	
	public static void main(String[] args) {
		
		int[][] matrix = {	{1,2, 3, 4},
							{5,6, 7, 8},
							{9,10,11,12},
							{13,14,15,16}
		
				
		};
		
		spiralPrint(4,4,matrix);
		
	}
	
	 private static void spiralPrint(int rowLen, int colLen, int a[][]) 
	    { 
	        int i, rowStart = 0, colStart = 0; 
	        /*  k - starting row index 
	        m - ending row index 
	        l - starting column index 
	        n - ending column index 
	        i - iterator 
	        */
	  
	        while (rowStart < rowLen && colStart < colLen) { 
	            // Print the first row from the remaining rows 
	            for (i = colStart; i < colLen; ++i) { 
	                System.out.print(a[rowStart][i] + " "); 
	            } 
	            rowStart++; 
	  
	            // Print the last column from the remaining columns 
	            for (i = rowStart; i < rowLen; ++i) { 
	                System.out.print(a[i][colLen - 1] + " "); 
	            } 
	            colLen--; 
	  
	            // Print the last row from the remaining rows */ 
	            if (rowStart < rowLen) { 
	                for (i = colLen - 1; i >= colStart; --i) { 
	                    System.out.print(a[rowLen - 1][i] + " "); 
	                } 
	                rowLen--; 
	            } 
	  
	            // Print the first column from the remaining columns */ 
	            if (colStart < colLen) { 
	                for (i = rowLen - 1; i >= rowStart; --i) { 
	                    System.out.print(a[i][colStart] + " "); 
	                } 
	                colStart++; 
	            } 
	            
	            System.out.println();
	        } 
	    } 
	  

}
