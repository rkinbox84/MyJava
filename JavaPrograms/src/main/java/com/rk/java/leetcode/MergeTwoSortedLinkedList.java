package com.rk.java.leetcode;

public class MergeTwoSortedLinkedList {

	static class ListNode{
		int val;
		ListNode next;
		ListNode(int inp){
			val = inp;
		}
	}
	
	
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        ListNode headNode=null;
	        ListNode rp =null;
	        
	        while(l1 != null && l2 !=null){
	            ListNode tmp;
	            if(l1.val <= l2.val){
	                if(headNode == null) {
	                    headNode = new ListNode(l1.val);
	                    headNode.next = null;
	                    rp = headNode;
	                    l1 = l1.next;
	                }else {
	                    tmp = new ListNode(l1.val);
	                    rp.next = tmp;
	                    rp = tmp;
	                    rp.next=null;
	                    l1 = l1.next;
	                }
	                
	            }else{
	                if(headNode == null) {
	                    headNode = new ListNode(l2.val);
	                    headNode.next = null;
	                    rp = headNode;
	                    l2 = l2.next;
	                }else {
	                    tmp = new ListNode(l2.val);
	                    rp.next = tmp;
	                    rp = tmp;
	                    rp.next = null;
	                    l2 = l2.next;
	            }
	        }
	    }
	        
	        while(l1 !=null) {
	            ListNode tmp = new ListNode(l1.val);
	            rp.next = tmp;
	            rp = tmp;
	            rp.next=null;
	            l1 = l1.next;
	        }
	        
	        while(l2 !=null) {
	            ListNode tmp = new ListNode(l2.val);
	            rp.next = tmp;
	            rp = tmp;
	            rp.next=null;
	            l2 = l2.next;
	        }
	        return headNode;
	}
	 
	 public static void main(String[] args) {
		 
		 ListNode l1 = new ListNode(1);
		 ListNode tmp;
		 
		 ListNode rp = l1;
		 
		 tmp = new ListNode(2);
		 rp.next = tmp;
		 rp = tmp;
		 rp.next = null;
		 
		 tmp = new ListNode(4);
		 rp.next = tmp;
		 rp = tmp;
		 rp.next = null;
		 
		 
		 
		 ListNode l2 = new ListNode(1);
		 ListNode tmp2;
		 
		 ListNode rp2 = l2;
		 
		 tmp2 = new ListNode(3);
		 rp2.next = tmp2;
		 rp2 = tmp2;
		 rp2.next = null;
		 
		 tmp2 = new ListNode(4);
		 rp2.next = tmp2;
		 rp2 = tmp2;
		 rp2.next = null;
		 
		 mergeTwoLists(l1, l2);
		 
	 }
}
