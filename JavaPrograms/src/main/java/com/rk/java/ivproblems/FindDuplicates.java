package com.rk.java.ivproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicates {
	
	public static void main(String[] args) {
		
		int[] impArray = {1,3,4,2,5,6,1,2,4};
		
		findOccurences(impArray);
	}

	private static boolean findOccurences(int[] inp) {
		
		//Map<Integer,Integer> occMap = new HashMap<Integer,Integer>();
		Map<Integer,Integer> occMap = new LinkedHashMap<Integer,Integer>();
		
		if(inp == null || inp.length <=0 ) {
			return false;
			
		}
		
		for(int i=0; i< inp.length; i++) {
			if(occMap.containsKey(inp[i])) {
				
				occMap.put(inp[i], occMap.get(inp[i])+1);
			} else {
				occMap.put(inp[i], 1);
			}
			
			
		}
		
		for(Entry en: occMap.entrySet()) {
			
			if((int)en.getValue() > 1) {
				System.out.println("Duplicate element:"+ en.getKey());
			}
			
		}
		return true;
		
	}
}
