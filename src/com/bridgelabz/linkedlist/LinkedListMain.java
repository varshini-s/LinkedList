package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) 
	
	{
		MyNodeImpl<Integer> myFirstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> mySecondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> myThirdNode = new MyNodeImpl<Integer>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);

	}

}
