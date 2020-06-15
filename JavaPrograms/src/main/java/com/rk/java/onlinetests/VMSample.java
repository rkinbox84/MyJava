package com.rk.java.onlinetests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VMSample {
	
	public static void main(String[] args) {
		
		List<List<Integer>> rounds = new ArrayList<List<Integer>>();
		
		List<Integer> inp = new ArrayList<Integer>();
		
		inp.add(2);
		inp.add(3);
		inp.add(603);
		
		rounds.add(inp);
		
		List<Integer> inp1 = new ArrayList<Integer>();
		
		inp1.add(1);
		inp1.add(1);
		inp1.add(286);
		
		rounds.add(inp1);
		
		List<Integer> inp2 = new ArrayList<Integer>();
		
		inp2.add(4);
		inp2.add(4);
		inp2.add(882);
		
		rounds.add(inp2);
		
		maxValue(4, rounds);
		
	}
	
	
	 public static void maxValue(int n, List<List<Integer>> rounds) {
		    // Write your code here

		    long[] dataArray = new long[n];

		    for(List<Integer> round: rounds) {
		        int start = round.get(0).intValue();
		        int end = round.get(1).intValue();
		        long value = round.get(2).intValue();
		        for(int i=start-1; i<end;i++ ){
		            dataArray[i] = dataArray[i] + value;
		        }
		    }

		    Arrays.sort(dataArray);

		        //return dataArray[dataArray.length -1];
		        
		        System.out.println(dataArray[dataArray.length -1]);
		    }

}
