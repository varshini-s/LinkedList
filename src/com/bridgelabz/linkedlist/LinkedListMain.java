package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) 
	
	{
		
		
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertNode(firstNode, secondNode);
		
		System.out.println("Searching node with given key value");
		Integer key=30;
		if(myLinkedList.search(key)!=null)
		System.out.println(myLinkedList.search(key).getKey());
		else
			System.out.println("Key not found in linked list");
		
		myLinkedList.printMyNodes();
		myLinkedList.popLast();
		myLinkedList.printMyNodes();

	}

}
