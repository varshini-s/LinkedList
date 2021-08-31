package com.bridgelabz.linkedlist;

public class MyLinkedList 

{
	private INodeIF head;
	private INodeIF tail;
	
	public MyLinkedList() 
	
	{
		this.head=null;
		this.tail=null;
		
	}
	
	public void  addNode(INodeIF newNode)
	{
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		if(this.head==null)
		{
			this.head=newNode;
		}
		else
		{
			INodeIF tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
		
	}
	
	

}
