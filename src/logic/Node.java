package logic;

import java.util.ArrayList;

public class Node<T> {

	private T _Data;
	private ArrayList<Node<T>> Branches;
	private Node<T> Parent;
	private boolean ArrayLoc= true;
	private  int limit = 2; 



	public Node(T _Data)
	{
		this._Data = _Data;
		Branches = new ArrayList<Node<T>>();
	}
	
	
	public void addChild(Node<T> pChild)
	{
		pChild.Parent = this;
		Branches.add(pChild);
		int tamaño = Branches.size();
		if (tamaño > limit)
		{
			ArrayLoc = false;
		}
	}
	
	
    public void addChildIndex(int pIndex, Node<T> pChild) {
        pChild.Parent = this;
        Branches.add(pIndex, pChild);
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


	public ArrayList<Node<T>> getBranches() {
		return Branches;
	}


	public void setBranches(ArrayList<Node<T>> branches) {
		Branches = branches;
	}


	public boolean isArrayLoc() {
		return ArrayLoc;
	}


	public void setArrayLoc(boolean arrayLoc) {
		ArrayLoc = arrayLoc;
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}		
}