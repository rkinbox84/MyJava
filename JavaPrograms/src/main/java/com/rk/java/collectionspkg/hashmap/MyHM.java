package com.rk.java.collectionspkg.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class MyHM {
	
	public static void main(String args[]) {
	
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>(3);
		
		hm.put(1, 1);
		hm.put(2, 2);
		hm.put(3, 3);
		
		hm.put(4, 4);

		hm.put(5, 4);

		hm.put(6, 4);

		hm.put(7, 4);
		
		for(Entry map: hm.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}
		
		
		System.out.println("value :: " + hm.get(25));
	}

}
