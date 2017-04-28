package logic;

import java.util.ArrayList;

import ui.Root;

public class N_aryTree<T> {
	
	private Node<T> root;
	private Node<T> actualNode;
	private int maxBranch;
	private static N_aryTree N_aryTree;
	
	
	private N_aryTree(int pMaxBranch)
	{
		maxBranch = pMaxBranch;
		root = new Node(new Root(15, 15, 20, 20));
	}
	
	public static N_aryTree getSingletonInstance(int maxBranch)
	{
		if (N_aryTree == null)
		{
			N_aryTree = new N_aryTree (maxBranch);
		}
		else
		{
			System.out.println("No se puede crear el objeto porque ya existe un objeto de la clase SoyUnico");
		}
		return N_aryTree;
	}
	
	

	public boolean recAddChild(Node<T> pParent, Node<T> pChild)
	{
		if(pParent.isArrayLoc())
		{
			pParent.addChild(pChild);
			//System.out.println(pChild.get_Data());
			return true;
		}
		else
		{
			for (int i=0; i<maxBranch; i++)
			{
				if ((recAddChild(pParent.getBranches().get(i),pChild)==true))
				{
					return true;
				}
				
			}
			return false;
			
			
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
