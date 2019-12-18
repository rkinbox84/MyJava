package com.rk.java.collectionspkg.comparatorImpl;

import java.util.Collections;
import java.util.Comparator;

public class AgeComparator implements IComparator, Comparator<Employee> {

	@Override
	public void sorter(EmpDetailsBean empDetails) {
		// TODO Auto-generated method stub
		
		Collections.sort(empDetails.getEmpList(), (AgeComparator)empDetails.getObj1());
		
		
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.age - o2.age;
		
		return o1.getAge().compareTo(o2.getAge());
	}

	
	
}
