package com.rk.java.collectionspkg.comparatorgrp;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultipleFieldSorter {
	
	@SuppressWarnings("unchecked")
    public static <T> void main(String[] args) throws Exception
    {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
        List<Employee> list = Arrays.asList(
                                new Employee(1080L, "A", "D", 10.2,sdf.parse("11/01/2002")),
                                new Employee(1015L, "A", "A", 7.2,sdf.parse("11/01/2002")),
                                new Employee(1001L, "C", "A", 11.2,sdf.parse("11/01/2004")),
                                new Employee(1064L, "B", "C", 34.2,sdf.parse("11/01/2008")),
                                new Employee(1020L, "B", "B", 2.2,sdf.parse("11/01/2001")));
 
        //Collections.sort(list, new GroupBySorter(new FirstNameSorter(), new LastNameSorter(), new AgeSorter()));
       // Collections.sort(list, new GroupBySorter(new StringSorter()));
        
       /* Comparator<Employee> byFieldComparator = 
        		GenericFieldComparator.getFieldComparator(Employee.class, "getFirstName","getAge");
        		
        Collections.sort(list, byFieldComparator);*/
 
      /*  List<Comparator<Employee>> byFieldComparator = 
        		GenericFieldComparator.getFieldComparator(Employee.class, "getFirstName","getId");
        		
        Collections.sort(list, new GroupBySorter2(byFieldComparator));*/
        
        List<T> gList = (List<T>) list;
        
        
        Object obj = list.get(0);
        
        List<?> byFieldComparator = 
        		GenericFieldComparator.getFieldComparator(obj.getClass(), "hireDate","Firstname","lastname");
        
        /*List<Comparator<Employee>> byFieldComparator = 
        		GenericFieldComparator.getFieldComparator(Employee.class, "hireDate","Firstname","lastname");*/
        		
        Collections.sort(list, new GroupBySorter2(byFieldComparator));
        
        for(Employee listData: list) {
        	System.out.println(listData);
        }
        
    }

}
