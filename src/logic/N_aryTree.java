package logic;

import java.awt.Color;
import java.util.ArrayList;

import ui.Figure;
import ui.Root;

public class N_aryTree<T> {
	
	private Node<T> root;
	private Node<T> actualNode;
	private int maxBranch;
	private static N_aryTree N_aryTree;
	
	
	private N_aryTree(int pMaxBranch)
	{
		maxBranch = pMaxBranch;
		root = new Node(new Root(15, 15,Color.BLUE,20, 20));
	}
	
	public static N_aryTree getSingletonInstance(int maxBranch)
	{
		if (N_aryTree == null)
		{
			N_aryTree = new N_aryTree (maxBranch);
		}
		else
		{
			System.out.println("No se puede crear el objeto porque ya existe un objeto de la clase N_aryTree");
		}
		return N_aryTree;
	}
	
	

	public boolean recAddChild(Node<T> pParent, Node<T> pChild)
	{
		
		Figure figurita = (Figure)pParent.get_Data();
		
		if(figurita.isType()==false)
		{
			if(pParent.isArrayLoc())
			{
				pParent.addChild(pChild);
				
				return true;
			}
			else
			{
				for (int i=0; i<maxBranch; i++) //Recusion Process to add nodes
				{
					if ((recAddChild(pParent.getBranches().get(i),pChild)==true))
					{
						return true;
					}
					
				}
				return false;
				
				
			}
		}else
		{
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
