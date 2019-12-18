package com.rk.java.collectionspkg.comparatorImpl;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		//Employee e1= new Employee("I00001",27,"QA");
		
		Employee e1 = new Employee.EmployeeBuilder().setAge(27).setUserID("I00001").setRole("QA").build();
				
		Employee e2= new Employee("I00022",23,"QA");
		Employee e3= new Employee("I00043",54,"QA");
		Employee e4= new Employee("I00009",42,"QA");
		Employee e5= new Employee("I00006",34,"QA");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		//Before shorting
		
		for(Employee e: empList) {
			System.out.println(e);
		}
		
		
		System.out.println("=============================");
		
		//Sort Based on age
		
		IComparator cmpObj = ComparatorFactory.getCmpObj(FieldType.AGE);
		
		EmpDetailsBean empDetails = new EmpDetailsBean(empList,cmpObj);
		
		cmpObj.sorter(empDetails);
		
		//Collections.sort(empList, new SortByAge());
		
		for(Employee e: empList) {
			System.out.println(e);
		}
		
	}

}
