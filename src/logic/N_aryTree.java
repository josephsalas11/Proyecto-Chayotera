package logic;

public class N_aryTree<T> {
	
	private Node<T> branch;
	
	
	
	public void N_aryTree()
	{
		this.branch = null;
	}
	
	
//******************************************
	public void addNode(Node<T> pNode)
	{
		Node start = new Node();
		if(branch == null)
		{
			branch = start;
		}else
		{
			Node auxiliarNode = branch;
			Node father;
			
			while(true)
			{
				father = auxiliarNode;
				//if(pNode)
			}
		}
	}
//********************************************
	
	
	
	
	
	
	
	public void addNodeValue(T pValue)
	{
		
	}
	
	public Node<T> findNode(T pValue)
	 	{
	 		return null;
	 	}

}
