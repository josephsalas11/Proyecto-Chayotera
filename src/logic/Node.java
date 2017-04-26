package logic;

import java.util.ArrayList;

public class Node<T> {

	private T _Data;
	private ArrayList<Node<T>> Branches;
	private Node<T> Parent;



	public Node()
	{
		Branches = new ArrayList<Node<T>>();
	}
	
	
	public void addChild(Node<T> pChild)
	{
		pChild.Parent = this;
		Branches.add(pChild);
	}
	
	
    public void addChildIndex(int pIndex, Node<T> pChild) {
        pChild.Parent = this;
        Branches.add(pIndex, pChild);
    }
    

    public Node<T> getChildIndex(int pIndex)  {
        return Branches.get(pIndex);
    }
	
	
	
	
	public T getNodeValue(int pIndex)
	{
		return null;
	}
	
	
	
//Getters and Setters
	public T get_Data() {
		return _Data;
	}


	public void set_Data(T _Data) {
		this._Data = _Data;
	}


	public Node<T> getParent() {
		return Parent;
	}


	public void setParent(Node<T> parent) {
		Parent = parent;
	}

}