package com.rk.java.datastructure.binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

//Recursion: https://www.youtube.com/watch?v=13m9ZCB8gjw
//Parent: https://leetcode.com/articles/lowest-common-ancestor-of-a-binary-tree/
public class BTLCARecNRec {
	
	TreeNode root = null;
	
	
	public static class TreeNode {
		TreeNode lChild;
		TreeNode rChild;
		int data;
		
		TreeNode(){
			
		}
		
		TreeNode(int inp){
			this.data = inp;
			lChild = null;
			rChild = null;
		}
		
		@Override 
		public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}
	    if (!(obj instanceof TreeNode))
	        return false;
	    if (obj == this)
	        return true;
	    return this.data == ((TreeNode) obj).data;
	    }
		
		@Override
		  public int hashCode() {
		    return data;
		  }

		
	}
	
	public TreeNode findLCAUsingParent(TreeNode root, TreeNode p, TreeNode q) {
		
		//Initialise Parent Map
		Map<TreeNode, TreeNode> parentMap = new HashMap<TreeNode,TreeNode>();
		
		Stack<TreeNode> nodeStk = new Stack<TreeNode>();
		
		
		parentMap.put(root, null);
		
		nodeStk.push(root);
		
		//Load all the Node and Parent in to the Parent Map
		while(!parentMap.containsKey(p) || !parentMap.containsKey(q)) {
			
			TreeNode node = nodeStk.pop();
			
			if(node.lChild != null) {
				
				parentMap.put(node.lChild, node);
				nodeStk.push(node.lChild);
			}
			
			if(node.rChild != null) {
				
				parentMap.put(node.rChild, node);
				nodeStk.push(node.rChild);
			}
			
		}
		
		
		HashSet<TreeNode> ans = new HashSet<TreeNode>();
		
		//Load all the parent from the P node to the root node
		while(p != null) {
			
			p = parentMap.get(p);
			ans.add(p);
			
		}
		
		//Loop until the common parent comes in the ans node
		while(!ans.contains(q)) {
			q = parentMap.get(q);
			
		}
		
		return q;
		
	}
	
	public void insertNode(int inp) {
		
		TreeNode node = new TreeNode(inp);
		
		if(root == null) {
			root = node;
		}else {
			insertBT(root,node);
		}
		
	}
	
	//Binary tree insertion using Level order can be achieved using Queue
	
	public void insertBT(TreeNode root, TreeNode inpNode) {
		
		Queue<TreeNode> nodeQueue = new LinkedList();
		
		nodeQueue.add(root);
		
		while(!nodeQueue.isEmpty()) {
			
			TreeNode nPtr = nodeQueue.poll();
			
			if(nPtr.lChild == null) {
				nPtr.lChild = inpNode;
				break;
			} else {
				nodeQueue.add(nPtr.lChild);
			}
			if(nPtr.rChild == null) {
				nPtr.rChild = inpNode;
				break;
			}else {
				nodeQueue.add(nPtr.rChild);
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BTLCARecNRec obj = new BTLCARecNRec();
		
		obj.insertNode(3);
		obj.insertNode(6);
		obj.insertNode(8);
		obj.insertNode(2);
		obj.insertNode(11);
		obj.insertNode(13);
		obj.insertNode(9);
		obj.insertNode(5);
		obj.insertNode(7);
		
		
		
		TreeNode op = obj.findLCAUsingParent(obj.root, new TreeNode(5), new TreeNode(13));

		System.out.println("LCA for given inputs ::"+ op.data);
		
		
	}

}
