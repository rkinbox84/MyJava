package com.rk.java.datastructure.sortingalgol;

/**
 * Best case O(nlogn) worst case O(n^2)
 * @author I309192
 *
 */
public class QuickSort {
	
	int[] arr1;
	
	QuickSort(int[] arr){
		
		this.arr1 = arr;
	}
	
	private void quickSort(int lowIndex, int upIndex) {
		int i = lowIndex;
		int j = upIndex;
		
		int index = (lowIndex+upIndex)/2;
		int pivot = arr1[index];
		
		while(i <= j) {

			
			while(arr1[i] < pivot) {
				i++;
			}
			
			while(arr1[j] > pivot) {
				j--;
				
			}
			
			if(i <= j) {
				
				swapNum(i,j);
				i++;
				j--;
			}
			
			if(j> lowIndex) {
				
				quickSort(lowIndex, j);
			}
			
			if(i < upIndex ) {
				quickSort(i, upIndex);
			}
			
		}
		
	}

	private void swapNum(int i, int j) {
		
		int temp = arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;
	}
	
	
	
	public static void main(String[] args) {
		 int[] inpArr = {3,7,8,5,2,1,9,6,4};
		 
		 QuickSort qs = new QuickSort(inpArr);
		 
		 qs.quickSort(0, inpArr.length-1);
		
		 for(int i:inpArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	}
	
}
