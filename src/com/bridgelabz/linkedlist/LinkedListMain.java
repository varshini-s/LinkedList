package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) 
	
	{
		
		
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertAfterGivenNode(firstNode, secondNode);
		
		System.out.println("Searching node with given key value");
		Integer key=30;
		if(myLinkedList.search(key)!=null)
		System.out.println(myLinkedList.search(key).getKey());
		else
			System.out.println("Key not found in linked list");
		
		
		MyNodeImpl<Integer> newNode = new MyNodeImpl<Integer>(40);
		myLinkedList.insertAfterGivenKey(30, newNode);
		
		myLinkedList.printMyNodes();
		myLinkedList.popLast();
		myLinkedList.printMyNodes();

	}

}
