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
	
	public void  printMyNodes()
	{
		
		StringBuffer myNodes = new StringBuffer("my nodes:");
		INodeIF tempNode= head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode=tempNode.getNext();
			
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	

}
