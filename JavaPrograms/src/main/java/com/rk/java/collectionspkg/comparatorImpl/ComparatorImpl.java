package com.rk.java.collectionspkg.comparatorImpl;

import java.util.Comparator;

public class ComparatorImpl {

	
}


class SortByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.age - o2.age;
		
		return o1.getAge().compareTo(o2.getAge());
	}
	
}
