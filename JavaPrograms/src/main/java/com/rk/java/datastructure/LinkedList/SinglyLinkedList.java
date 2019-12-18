package com.rk.java.datastructure.LinkedList;

public class SinglyLinkedList {
	
	public static void main(String[] args) {
		
		Node n = new Node();
		
		n.insertNode(5);
		n.insertNode(10);
		
		n.display();
		
		n.insertAtPos(25, 2);
		
		n.display();
		
		n.deleteNode(10);
		n.display();
	}

}


class Node{
	Node link=null;
	Node start=null;
	Node end=null;
	int data;
	
	Node(){
		
	}
	Node(int d){
		this.data =d;
		
	}
	
	public void insertNode(int inp) {
		
		if(start == null) {
			
			Node n = new Node(inp);
			start = n;
			end =n;
			end.link=null;
			
			
		}else {
			Node n = new Node(inp);
			end.link=n;
			end=n;
			n.link=null;
		}
	}
	
	public void insertAtPos(int data, int pos) {
		
		int count=0;
		Node tmp= start;
		Node n1=tmp;
		
		while(count < pos) {
			
			count++;
			n1=tmp;
			tmp=tmp.link;
		}
		
		Node new1 = new Node(data);
		
		new1.link = tmp;
		n1.link=new1;
		
		
	}
	
	public void deleteNode(int data) {
		
		Node tmp=start;
		Node n1= tmp;
		
		while(tmp.data != data) {
			
			n1=tmp;
			tmp = tmp.link;
		}
		
		n1.link = tmp.link;
	}
	
	public void display() {
		
		Node p = start;
		System.out.println();
		while(p!=null) {
			System.out.print(p.data);
			System.out.print("=>");
			p= p.link;
		}
		
		System.out.print("null");
	}
}