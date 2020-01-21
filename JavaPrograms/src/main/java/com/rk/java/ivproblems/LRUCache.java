package com.rk.java.ivproblems;

import java.util.HashMap;
import java.util.Map;

//Referance Vedio: https://www.youtube.com/watch?v=NDpwj0VWz1U

public class LRUCache {
	
	//Head and Tails are fixed and dummy nodes
	Node head_Node = null;
	Node tail_Node = null;
	int cache_Capacity;
	
	//Implementation using HashMap and DLL for constant time read and write
	HashMap<Integer, Node> hashNode;
	
	LRUCache(int capacity){
		this.cache_Capacity = capacity;
		
		hashNode = new HashMap<Integer,Node>();
	}
	
	//Get Interface for the Cache
	public int get(int key) {
		int returnValue = -1;
		
		Node gNaode = hashNode.get(key);
		
		if(gNaode !=null) {
			returnValue = gNaode.val;
		}
		
		return returnValue;
	}
	
	//Put interface for the cache
	public void put(int key, int value) {
		
		Node new_node = new Node(key,value);
		
		Node nodeExists = hashNode.get(key);
		
		if(nodeExists != null) {
			
			remove(nodeExists);
			add(new_node);
			hashNode.remove(key);
			hashNode.put(key, new_node);
			
		}else {
			if(cache_Capacity == hashNode.size()) {
				
				hashNode.remove(tail_Node.prv.key);
				Node removeNode = tail_Node.prv;
				remove(removeNode);
				
				
			}
			
			hashNode.put(key, new_node);
			add(new_node);
		}
	}
	
	//Always add the new node at the front of the DLL
	public void add(Node node) {
		
		if(head_Node == null) {
			
			head_Node = new Node();
			tail_Node = new Node();
			
			head_Node.nxt = node;
			node.prv = head_Node;
			
			tail_Node.prv = node;
			
			node.nxt = tail_Node;
		}else {
			
			head_Node.nxt = node;
			node.prv = head_Node;
			
			tail_Node.prv = node;
			
			node.nxt = tail_Node;
		}
		
	}
	
	//Remove the given Node
	public void remove(Node node) {
		
		Node prev_node = node.prv;
		Node nxt_node = node.nxt;
		
		prev_node.nxt = nxt_node;
		nxt_node.prv = prev_node;
		
	}
	
	class Node{
		Node prv;
		Node nxt;
		int key;
		int val;
		
		
		Node(){}
		
		Node(int inpKey, int inpVal){
		
			this.key = inpKey;
			this.val = inpVal;
		}
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		
		cache.put(1, 1);
		cache.put(2, 2);
		
	}

}
