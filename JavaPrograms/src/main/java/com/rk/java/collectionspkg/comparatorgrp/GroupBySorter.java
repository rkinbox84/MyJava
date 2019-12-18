package com.rk.java.collectionspkg.comparatorgrp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GroupBySorter implements Comparator<Employee> {
	 
    private List<Comparator<Employee>> listComparators;
 
    public GroupBySorter(Comparator<Employee>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    public int compare(Employee empOne, Employee empTwo) {
        for (Comparator<Employee> comparator : listComparators) {
            int result = comparator.compare(empOne, empTwo);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}