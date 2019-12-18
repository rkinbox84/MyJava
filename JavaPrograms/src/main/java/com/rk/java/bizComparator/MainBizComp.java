package com.rk.java.bizComparator;

import java.util.ArrayList;
import java.util.List;

public class MainBizComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> empRec1 = new ArrayList<String>();
		List<String> empRec2 = new ArrayList<String>();
		List<String> empRec3 = new ArrayList<String>();
		
		List<List<String>> recList = new ArrayList<List<String>>();
		
		empRec1.add("I002");
		empRec1.add("Ram");
		
		empRec2.add("I025");
		empRec2.add("arun");
		
		empRec3.add("I005");
		empRec3.add("kamal");
		
		recList.add(empRec1);
		recList.add(empRec2);
		recList.add(empRec3);
	}

}
