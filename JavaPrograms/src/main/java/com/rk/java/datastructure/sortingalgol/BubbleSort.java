package com.rk.java.datastructure.sortingalgol;

/**
 * The time complexity is O(n^2)
 * @author I309192
 *
 */
public class BubbleSort {

	private static void bubbleSort(int[] arr) {
		
		for(int i=0; i< arr.length-1;i++) {
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];
				}
			}
			
		}
	}
}
