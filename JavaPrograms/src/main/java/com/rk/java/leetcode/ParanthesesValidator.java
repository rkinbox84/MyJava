package com.rk.java.leetcode;

import java.util.Stack;

public class ParanthesesValidator {
	
	public static void main(String[] args) {
		
		System.out.println(ParanthesesValidator.isValid("]"));
	}
	
	
public static boolean isValid(String s) {
        
        Stack<Character> st = new Stack<Character>();
        
        if(s == null || s.length() <=0) {
            return false;
        }
        
        for(int i=0; i< s.length(); i++) {
            
            if(s.charAt(i) != '}' && s.charAt(i) != ')' && s.charAt(i) != ']') {
                st.push(s.charAt(i));
            }else if(!st.isEmpty()){
                  if(s.charAt(i) == '}' && st.peek() == '{' || s.charAt(i) == ')' && st.peek() == '('|| s.charAt(i) == ']' && st.peek() == '['){
                      st.pop();
                  }else {
                      return false;
                  }
            }else {
            	return false;
            }
            
        }
        
        return st.size() == 0 ? true : false;
    }

}
