package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) 
	
	{
		
		
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		MyNodeImpl<Integer> fourthNode = new MyNodeImpl<Integer>(20);

		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertAfterGivenNode(firstNode, secondNode);
		
		Integer key=30;
		System.out.println("Searching node with given key value "+key);
		if(myLinkedList.search(key)!=null)
		System.out.println("Key found :"+myLinkedList.search(key).getKey());
		else
			System.out.println("Key not found in linked list");
		
		
		MyNodeImpl<Integer> newNode = new MyNodeImpl<Integer>(40);
		myLinkedList.insertAfterGivenKey(30, newNode);
		
		Integer keyToDelete=30;
		System.out.println("before deleting, size of linked list is: "+myLinkedList.size());
		myLinkedList.deleteGivenKeyNode(keyToDelete);
		System.out.println("After deleting, size of linked list is: "+myLinkedList.size());
		myLinkedList.printMyNodes();
		myLinkedList.popLast();
		myLinkedList.printMyNodes();
		
		System.out.println("Ordered list :");
		
		SortedLinkedList<Integer> orderedList = new SortedLinkedList<Integer>();
		MyNodeImpl<Integer> FirstNodeForOrdered = new MyNodeImpl<Integer>(4);
		MyNodeImpl<Integer> secondNodeForOrdered= new MyNodeImpl<Integer>(5);
		MyNodeImpl<Integer> thirdNodeForOrdered = new MyNodeImpl<Integer>(3);
		MyNodeImpl<Integer> fourthNodeForOrdered = new MyNodeImpl<Integer>(20);
		orderedList.add(FirstNodeForOrdered);
		orderedList.add(secondNodeForOrdered);
		orderedList.add(thirdNodeForOrdered);
		orderedList.add(fourthNodeForOrdered);
		orderedList.printMyNodes();
		
		
		
		
		

	}

}
