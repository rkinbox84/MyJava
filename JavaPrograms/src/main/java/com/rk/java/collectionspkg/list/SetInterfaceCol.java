package com.rk.java.collectionspkg.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceCol {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("aa");
		hs.add("bb");
		hs.add(null);
		hs.add(null);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<String> lhs = new LinkedHashSet<String>();
		
		
		lhs.add(null);
		
		
		
		
		
	}
}
