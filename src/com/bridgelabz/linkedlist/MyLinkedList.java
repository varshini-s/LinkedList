package com.bridgelabz.linkedlist;

public class MyLinkedList<K>

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
	public void appendNode(INodeIF newNode)
	{
		if(this.head==null)
		{
			this.head=newNode;
		}
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		else
		{
			
			
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
		
		
	}
	public void insertNode(INodeIF myNode,INodeIF newNode)
	{
		INodeIF tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
		
	}
	
	public INodeIF pop()
	{
		
		INodeIF tempNode=head;
		this.head=head.getNext();
		
		return tempNode;
		
	}
	
	public INodeIF popLast()
	{
		INodeIF tempNode= head;
		while(tempNode.getNext()!=tail)
		{
			
			tempNode=tempNode.getNext();
			
		}
		this.tail=tempNode;
		this.tail.setNext(null);
		tempNode=tempNode.getNext();
		return tempNode;
		
	}
	
	public INodeIF search(K key)
	{
		INodeIF tempNode = head;
		INodeIF requiredNode=null;
		while(tempNode.getNext()!=null && tempNode.getKey()!=key)
		{
			
			
			tempNode=tempNode.getNext();
		}
		if(tempNode.getKey()==key)
		{
			requiredNode=tempNode;
		}
		
		
		return requiredNode;
		
		
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
