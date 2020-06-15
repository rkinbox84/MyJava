package com.rk.java.ivproblems;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CityPath {


	// Class name should be "Source",
	// otherwise solution won't be accepted

	    public static void main(String[] args) {
	        
	        Scanner in = new Scanner(System.in);
	        
	        // Declare the variable
	        int a;
	        StringBuilder sb = new StringBuilder();
	        // Read the variable from STDIN
	        a = in.nextInt();
	        in.nextLine();
	        
	        ArrayList<String> locList = new ArrayList<String>();
	        for(int i=0; i< a; i++){
	        	locList.add(in.nextLine());

	        }
	        
	        String start = in.nextLine();
	        Map<String,ArrayList> pathMap = getMap(locList);
	        // Output the variable to STDOUT
	        System.out.println(a);
	        
	        findPath(start,pathMap);
	   }
	   
	   public static void findPath(String start,Map<String,ArrayList> pathMap){
	       
	       System.out.println(start);
	       
	       if(pathMap.containsKey(start)) {
	           ArrayList<String> list = pathMap.get(start);
	           for(String val: list){
	               findPath(val,pathMap);
	           }
	       }else {
	           return;
	       }
	   }
	   
	   public static Map<String,ArrayList> getMap(ArrayList<String> locList){
	       Map<String,ArrayList> pathMap = new HashMap<String,ArrayList>();
	       ArrayList<String> list =null;
	       
	       for(String val: locList) {
	           String[] inpString = val.split(" ");
	           if(!pathMap.containsKey(inpString[0])) {
	               list = new ArrayList<String>();
	               list.add(inpString[1]);
	               pathMap.put(inpString[0],list);
	           }else if(pathMap.containsKey(inpString[0])){
	               list = pathMap.get(inpString[0]);
	               list.add(inpString[1]);
	               pathMap.put(inpString[0],list);
	           }
	       }
	       
	       return pathMap;
	   }
	   
	}


