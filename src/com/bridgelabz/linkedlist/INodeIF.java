package com.bridgelabz.linkedlist;

public interface INodeIF<K>

{
	K getKey();
	void setKey(K key);
	
	INodeIF getNext();
	void setNext(INodeIF next);
	
	
	

}
