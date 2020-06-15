package com.rk.java.ivproblems;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniqueCharsInaString {
	
	public static void main(String[] args) {
		
		LongestUniqueCharsInaString lu = new LongestUniqueCharsInaString();
		
		int x = lu.printLongUniqueChar("abcdabdefffffccdcfe");
		int y = lu.lengthOfLongestSubstring("abcdabdefffffccdcfe");

		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	public int printLongUniqueChar(String inpStr) {
		
		StringBuilder sb = new StringBuilder();
		
		int maxLen = 0;
		
		char[] chrArr = inpStr.toCharArray();
		
		for(int i=0; i< chrArr.length; i++) {
			
			if(sb.indexOf(Character.toString(chrArr[i])) == -1) {
				sb.append(chrArr[i]);
				
				if(sb.length() > maxLen) {
					maxLen = sb.length();
				}
			} else {
				
				sb.delete(0, sb.lastIndexOf(Character.toString(chrArr[i])) + 1);

				sb.append(chrArr[i]);
				
			}
			
		}
		
		//System.out.println("The longest unique chars: "+ sb.toString());
		System.out.println("The longest unique chars: "+ maxLen);
		return maxLen;
	}
	
public int lengthOfLongestSubstring(String s) {
        
        char[] chrArr = s.toCharArray();
        
        int lp=0;
        int max=0;
        int len=0;
        Iterator setItr = null;
        Set<Character> chrSet = new LinkedHashSet<Character>();
        
        for(int rp=0; rp < chrArr.length; rp++){
            
            if(!chrSet.contains(chrArr[rp])) {
                chrSet.add(chrArr[rp]);
            }else {
                 setItr = chrSet.iterator();
                while(!setItr.next().equals(chrArr[rp])) {
                    
                    setItr.remove();
                }
               setItr.remove();
               chrSet.add(chrArr[rp]);
            }
            
            len = chrSet.size();
           if(max < len) {
               max = len;
           } 
            
        }
        
      return max;  
    }

}
