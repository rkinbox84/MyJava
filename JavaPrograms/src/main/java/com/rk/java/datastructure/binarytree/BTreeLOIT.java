package com.rk.java.datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;

//LOIT - Level Order Insert and Traversal

public class BTreeLOIT {
	
	static Node root;
	static Node temp;
	
	//Node creation
	static class Node {
		
		Node left,right;
		int val;
		
		Node(int inp){
			this.val=inp;
			this.left = null;
			this.right=null;
			
		}
		
		
	}
	
	//Inset node into BT
	static void insertNodeLO(Node n1, int inpVal) {
		
		temp = n1;
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(temp);
		
		while(!q.isEmpty()) {
			
			temp = q.poll();
			
			if(temp.left == null) {
				temp.left = new Node(inpVal);
				break;
			} else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(inpVal);
				break;
			} else {
				q.add(temp.right);
			}
			
		}
		
	}
	
	
	static void insert(int in) {
		
		if(root == null) {
			root = new Node(in);
		} else {
			insertNodeLO(root, in);
		}
	}

	//LO Traverse BT and print
	
	static void traverseBTLO(Node r) {
		
		temp = r;
		
		Queue<Node> q1 = new LinkedList<Node>();
		
		q1.add(temp);
		
		while(!q1.isEmpty()) {
			
			temp = q1.poll();
			
			System.out.print(temp.val+" ");
			
			if(temp.left!=null) {
				
				q1.add(temp.left);
				
			}
			
			if(temp.right != null) {
				q1.add(temp.right);
			}
		}
		
	}
	
	// Driver code 
    public static void main(String args[]) 
    { 
    	insert(10);
    	insert(11);
    	insert(7);
    	insert(9);
    	insert(15);
    	insert(8);

       
        System.out.print( "Level Order traversal before insertion:"); 
        traverseBTLO(root); 
       
        int key = 12; 
        insert(key); 
       
        System.out.print("\n Level order traversal after insertion:"); 
        traverseBTLO(root); 
    } 
	
}
