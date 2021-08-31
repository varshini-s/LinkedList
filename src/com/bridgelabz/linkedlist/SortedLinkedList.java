package com.bridgelabz.linkedlist;
import com.bridgelabz.linkedlist.MyLinkedList;

public class SortedLinkedList<K extends Comparable<K>>

{
	INodeIF<K> head;
	INodeIF<K> tail;
	
	public SortedLinkedList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public void add(INodeIF<K> newNode)
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
			INodeIF<K> tempNode=head;
			INodeIF<K> prevNode=head;
			
			while(tempNode.getKey().compareTo(newNode.getKey())<0 && tempNode.getNext()!=null)
			{
				prevNode=tempNode;
				tempNode=tempNode.getNext();
			}
			
			if(tempNode==this.tail && tempNode.getKey().compareTo(newNode.getKey())<0)
			{
				
					tempNode.setNext(newNode);
					this.tail=newNode;
				
				
			}
			else if(tempNode==this.head && tempNode.getKey().compareTo(newNode.getKey())>0)
			{
				newNode.setNext(head);
				this.head=newNode;
				
			}
			else
			{
				prevNode.setNext(newNode);
				newNode.setNext(tempNode);
			}
			
			
		}
		
	}
	
	public INodeIF<K> pop()
	{
		
		INodeIF<K> tempNode= head;
		while(tempNode.getNext()!=tail)
		{
			
			tempNode=tempNode.getNext();
			
		}
		this.tail=tempNode;
		this.tail.setNext(null);
		tempNode=tempNode.getNext();
		return tempNode;
		
	}
	
	
	public void  printMyNodes()
	{
		
		StringBuffer myNodes = new StringBuffer("my nodes:");
		INodeIF<K> tempNode= head;
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
