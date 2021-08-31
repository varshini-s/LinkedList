package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) 
	
	{
		MyNodeImpl<Integer> myFirstNode = new MyNodeImpl<Integer>(70);
		MyNodeImpl<Integer> mySecondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> myThirdNode = new MyNodeImpl<Integer>(56);
		
		System.out.println("Linked list created by adding");
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode(myFirstNode);
		myLinkedList.addNode(mySecondNode);
		myLinkedList.addNode(myThirdNode);
		myLinkedList.printMyNodes();
		
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		System.out.println("Linked list created by appending");
		MyLinkedList myLinkedListUsingAppend = new MyLinkedList();
		myLinkedListUsingAppend.appendNode(firstNode);
		myLinkedListUsingAppend.appendNode(secondNode);
		myLinkedListUsingAppend.appendNode(thirdNode);
		myLinkedListUsingAppend.printMyNodes();

	}

}
