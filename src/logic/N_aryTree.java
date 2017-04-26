package logic;

import ui.Root;

public class N_aryTree<T> {
	
	private Node<T> root;
	private Node<T> actualNode;
	private int maxBranch;
	
	
	public N_aryTree(int pMaxBranch)
	{
		maxBranch = pMaxBranch;
	}
	
	
	
	public void addNode( Node<T> Child ,Node<T> Parent)
	{
		Node auxiliar = new Node();
		
		if (root==null)
		{
			auxiliar = root;
		}else
		{
			this.recAddChild(root, Parent, Child);
		}
		
	}
	
	
	public void recAddChild(Node<T> pActualNode, Node<T> Parent, Node<T> Child)
	{
		if (pActualNode.get_Data().equals(Parent.get_Data()))
		{
			pActualNode.addChild(pActualNode);
		}
		
	}
	
	
//Getters and Setters
	public Node<T> getRoot() {
		return this.root;
	}
	public void setRoot(Node<T> root) {
		this.root = root;
	}

}
