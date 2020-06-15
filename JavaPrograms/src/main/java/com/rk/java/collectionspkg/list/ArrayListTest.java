package com.rk.java.collectionspkg.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.rk.java.collectionspkg.comparatorgrp.Employee;

public class ArrayListTest { @SuppressWarnings("deprecation")

public static void main(String[] args) throws CloneNotSupportedException 
{
    ArrayList<Employee> employeeList = new ArrayList<>(); 
     
    employeeList.add(new Employee(1l, "adam", "qa", null, null));
     
    System.out.println(employeeList);   
     
    ArrayList<Employee> employeeListClone = new ArrayList<>(); 
     
    Iterator<Employee> iterator = employeeList.iterator();
    while(iterator.hasNext()){
        employeeListClone.add((Employee) iterator.next().clone());
    }
     
    employeeListClone.get(0).setId(2l);
    employeeListClone.get(0).setName("brian");
    employeeListClone.get(0).getDob().setDate(13);;
     
    System.out.println(employeeList); 
    System.out.println(employeeListClone);   
}}
