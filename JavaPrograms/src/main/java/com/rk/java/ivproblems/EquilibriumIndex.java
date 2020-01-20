package com.rk.java.ivproblems;

public class EquilibriumIndex {

    public static void main(String[] args) 
    { 
        EquilibriumIndex equi = new EquilibriumIndex(); 
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
        int arr_size = arr.length; 
        System.out.println(equi.equilibrium(arr, arr_size)); 
    }
    
    
    int equilibrium(int arr[], int n)  {
    	
    	int length = n-1;
    	int lSum=0;
    	int rSum=0;
    	
    	for(int i=0; i<n;i++) {
    		
    		if(length > i) {
    			lSum = lSum + arr[i];
    			rSum = rSum + arr[length];
    			
    			if(lSum==rSum) {
    				
    				System.out.println(i+1 + "equilocation");
    			}
    			
    			length --;
    		}
    	}
		return n;
    	
    }
}
