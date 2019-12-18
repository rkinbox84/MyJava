package com.rk.java.collectionspkg.comparatorgrp;

import java.util.Comparator;

public class FieldComparators {
	
}

class StringSorter<T extends Comparable<T>> implements Comparator<T>
{
    public int compare(T o1, T o2)
    {

        return o1.compareTo(o2);
    }
}

 class FirstNameSorter implements Comparator<Employee>
{
    public int compare(Employee o1, Employee o2)
    {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
 
 class LastNameSorter implements Comparator<Employee>
{
    public int compare(Employee o1, Employee o2)
    {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
 
 class AgeSorter implements Comparator<Employee>
{
    public int compare(Employee o1, Employee o2)
    {
        return o1.getAge() - o2.getAge();
    }
}