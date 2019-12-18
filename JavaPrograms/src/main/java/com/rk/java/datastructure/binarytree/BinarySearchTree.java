package com.rk.java.datastructure.binarytree;

public class BinarySearchTree {

	static Node root;
	boolean recursive=false;
	
	
	static class Node{
		Node left,right;
		int val;
		
		Node(int inp){
			this.val = inp;
			this.left = null;
			this.right = null;
		}
		
		public void displayData(){
            System.out.print(val + " ");
        }
	}
	
	//Iterative BST insert
	
	public static void insertItr(Node n, int val) {
		
		Node current = n;
		
		while(true) {
			if(val < current.val) {
				if(current.left ==  null) {
					current.left = new Node(val);
					break;
				}else {
					current = current.left;
				}
			}else if(val > current.val) {
				if(current.right == null) {
					current.right = new Node(val);
					break;
				}else {
					current = current.right;
				}
			}
		}
		
	}
	
	public void insert(int inp) {
		
		if(root == null) {
			root = new Node(inp);
		}else{
			if(recursive) {
				insertRecursive(root, inp);
			}else {
				insertItr(root, inp);
			}
		}
	}
	
	
	//Insert recursive
	
	public static Node insertRecursive(Node n, int inp) {
		
		if(n == null) {
			return new Node(inp);
		}
		
		if(inp < n.val) {
			n.left = insertRecursive(n.left, inp);
		}else if(inp > n.val) {
			n.right= insertRecursive(n.right, inp);
		}
		
		return n;
	}
	
	//Pre Order traversal
	
	public void preOrder(Node n) {
		
		if(n != null) {
			
			n.displayData();
			preOrder(n.left);
			preOrder(n.right);
			
		}
	}
	
	//Pre Order traversal
	
	public void inOrder(Node n) {
		
		if(n != null) {
			
			inOrder(n.left);
			n.displayData();
			inOrder(n.right);
			
		}
	}
	
	//Pre Order traversal
	
	public void postOrder(Node n) {
		
		if(n != null) {
			
			postOrder(n.left);
			postOrder(n.right);
			n.displayData();
			
			
		}
	}

	public boolean find(Node s, int val) {
		
		while(val != s.val) {
			if(val < s.val) {
				s = s.left;
			}else {
				s=s.right;
			}
			
			if(s==null) {
				return false;
			}
		 }
		
		return true;
	}

	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.recursive = true;
        bst.insert(50);
        bst.insert(70);
        bst.insert(15);
        bst.insert(35);
        bst.insert(30);
        bst.insert(31);
        System.out.println("Inorder traversal of binary tree");
        bst.inOrder(bst.root);
        System.out.println();
        
        boolean result = bst.find(root, 70);
        System.out.println((result == false)? "Node not found" : "Node found");
        System.out.println("Preorder traversal of binary tree");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println("Postorder traversal of binary tree");
        bst.postOrder(bst.root);
        System.out.println();
    }
}

//https://netjs.blogspot.com/2019/03/binary-tree-implementation-in-java-insertion-traversal.html