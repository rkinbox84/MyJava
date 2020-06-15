package com.rk.java.ivproblems;

public class GetMinStk_O_one_TC {
	
	/**
	 * Find the min from stack from any given time in O(1) time complexity
	 * Can be Solved using Supporting stack ie, 2 stacks
	 * 
	 * 1. Push first incomming element to array 1 and Stack 2
	 * 2. Push next element ino to main stack and push
	 * supporitng stack only if smaller than the peek of supporting stack else skip
	 * 3. If we are pop element from main stack then pop from supporting stack only
	 * if supporting element peek is equals to the popper element of main stack
	 * else dont pop from supporting styack
	 * This algo solve the getting min in O(1)
	 */

}
