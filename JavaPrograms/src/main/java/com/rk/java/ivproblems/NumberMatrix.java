package com.rk.java.ivproblems;

import java.util.Scanner;

public class NumberMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of matrix: ");
		
		int size = sc.nextInt();
		
		System.out.println("Enter Number to be filled: ");
		
		int number = sc.nextInt();
		
		printMatrix(size, number);
	}
	
	public static void printMatrix(int size, int num) {
		int[] arr= new int[size];
		
		int length = arr.length/2;
		
		int k=0;
		
		int[][] arr1= new int[length][];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=num;
		}
		
		arr1[k] = new int[7];
		
		
		arr1[k] = arr.clone();
		
		
		k++;
		displayArray(arr);
		
		int start =1;
		int end= arr.length-1;
		
		while(start <= end){
			
			for(int i=start; i<= end-1;i++) {
				arr[i]= arr[i]-1;
			}
			 
			if(k<3) {
				arr1[k] = new int[7];
				arr1[k] = arr.clone();
			}
			
			
			
			displayArray(arr);
			
			start++;
			end--;
			k++;
			
		}
		
		displayArray(arr1);
	}
	
	public static void displayArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static void displayArray(int[][] arr1) {
		for(int i=2;i>=0;i--) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
}
