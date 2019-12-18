package com.rk.java.collectionspkg.comparatorgrp;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenericFieldComparator {


	private static<T,R extends Comparable<R>> Comparator<T> genericComparator(
	    final Method method, final Class<R> returnType) throws Exception {    
	  return new Comparator<T>() {
	    @Override
	    public int compare(T o1, T o2) {
	      try {
	        R a = invoke(method, o1);
	        R b = invoke(method, o2);
	        return a.compareTo(b);
	      } catch (Exception e) {
	        throw new RuntimeException(e);
	      }
	    }

	    private R invoke(Method method, T o) throws Exception {
	      return returnType.cast(method.invoke(o));
	    }
	  };
	}

/*	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static<T> Comparator<T> getFieldComparator(Class<T> cls, String methodName) throws Exception, SecurityException {
		 Method method = cls.getMethod(methodName);
		  if (method.getParameterTypes().length != 0) 
		    throw new Exception("Method " + method + " takes parameters");

		  Class<?> returnType = method.getReturnType();
		  if (!Comparable.class.isAssignableFrom(returnType))
		    throw new Exception("The return type " + returnType + " is not Comparable");

		  return genericComparator(method, (Class<? extends Comparable>) returnType);  
	}*/
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static<T> List<Comparator<T>> getFieldComparator(Class<T> cls, String... fields) throws Exception, SecurityException {
		 List<String> fieldList = Arrays.asList(fields);
		 
		 List<Comparator<T>> comparatorList= new ArrayList<Comparator<T>>();
		
		 for(String field: fieldList) {
			 
			 Method methodName = getMethodName(cls,field);
			 
			 if(methodName == null) {
				 throw new Exception("Get Method for the field ::" + field + "does not exists!!");
			 }
			 
			  if (methodName.getParameterTypes().length != 0) 
			    throw new Exception("Method " + methodName + " takes parameters");

			  Class<?> returnType = methodName.getReturnType();
			  if (!Comparable.class.isAssignableFrom(returnType))
			    throw new Exception("The return type " + returnType + " is not Comparable");

			  comparatorList.add(genericComparator(methodName, (Class<? extends Comparable>) returnType)); 
			 
		 }
		return comparatorList;
		 
	}
	
	public static <T> Method getMethodName(Class<T> cls, String fieldName) {
		
		String method = "get"+fieldName;
		
		
		Method[] methodArray = cls.getMethods();
		
		for(Method methodName: methodArray) {
			
			if(methodName.getName().equalsIgnoreCase(method)) {
				return methodName;
			}
		}
		
		return null;
		
	}
}
