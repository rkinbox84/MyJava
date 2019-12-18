package com.rk.java.collectionspkg.comparatorgrp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GroupBySorter2<T> implements Comparator<T> {
	
	 private List<Comparator<T>> listComparators = new ArrayList<Comparator<T>>();
	 
	    public  GroupBySorter2(List<Comparator<T>> cmpList) {
	        this.listComparators = cmpList;
	    }

		@Override
		public int compare(T o1, T o2) {
			 for (Comparator<T> comparator : listComparators) {
		            int result = comparator.compare(o1, o2);
		            if (result != 0) {
		                return result;
		            }
		        }
		        return 0;
		}

}