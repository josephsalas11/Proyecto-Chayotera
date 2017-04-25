package logic;

import java.util.ArrayList;

public class Node<T> {
	
	private ArrayList<Node<T>> Branches;
	private Node<T> leftChild;
	private Node<T> rightChild;
	
	public Node()
	{
		Branches = new ArrayList<Node<T>>();
		this.leftChild = null;
		this.rightChild = null;
	}
	
	
	public void addChild(T pValue)
	{
		
	}
	
	
	public void addChild(Node<T> pNode)
	{
		
	}
	
	
	public Node<T> getNodeChild(int pIndex)
	{
		return null;
	}
	
	public T getNodeValue(int pIndex)
	{
		return null;
	}
	 	
	
	

}
