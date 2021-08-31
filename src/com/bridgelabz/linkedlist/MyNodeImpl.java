package com.bridgelabz.linkedlist;

public class MyNodeImpl<K> implements INodeIF<K>

{
	
	private K key;
	private INodeIF<K> next;

	

	public MyNodeImpl(K key)
	{
		
		this.key=key;
		this.next=null;
	}
	
	public INodeIF<K> getNext() 
	{
		return next;
	}

	@Override
	public void setNext(INodeIF next) 
	{
		this.next = next;
		
	}

	

	@Override
	public K getKey() 
	{
		return key;
	}

	@Override
	public void setKey(K key) 
	{
		this.key=key;
	}

	

}
