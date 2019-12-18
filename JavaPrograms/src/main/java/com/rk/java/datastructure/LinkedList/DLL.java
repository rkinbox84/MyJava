package com.rk.java.datastructure.LinkedList;

public class DLL {
	
public static void main(String[] args) {
		
		DNode n = new DNode();
		
		n.insert(5);
		n.insert(10);
		
		n.display();
		

	}

}

class DNode{
	int data;
	DNode start=null;
	DNode end=null;
	DNode rlink=null;
	DNode llink=null;
	
	DNode(){
		
	}
	
	DNode(int inp){
		
		this.data=inp;
		
	}
	
	public void insert(int d) {
		
		if(start == null) {
			
			DNode n = new DNode(d);
			start = n;
			end=n;
			n.rlink=null;
			n.llink=null;
			
		}else {
			DNode n = new DNode(d);
			DNode tmp=end;
			end=n;
			end.rlink=null;
			end.llink=tmp;
			tmp.rlink=end;
		}
		
	}
	
	public void display() {
		
		DNode p = start;
		System.out.println();
		while(p!=null) {
			System.out.print(p.data);
			System.out.print("=>");
			p= p.rlink;
		}
		
		System.out.print("null");
	}
}
