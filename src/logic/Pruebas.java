package logic;

public class Pruebas {

	public static void main(String[] args) {
		
		Node.setLimit(6);//Aqui va el numero random
		
		N_aryTree arbolito = new N_aryTree(6);
		Node noditoPadre = arbolito.getRoot();
		
		for (int i = 0; i<8; i++)
		{
			Node nodito = new Node();
			nodito.set_Data(i);
			arbolito.recAddChild(noditoPadre, nodito);
	
		}

		
		

		for (int i = 0; i<6; i++)
		{
			Node nodoAux = (Node) (arbolito.getRoot().getBranches().get(i));
			System.out.println(nodoAux.get_Data());
		}	
		Node nodoAux = (Node) (arbolito.getRoot().getBranches().get(0));
		Node aux = (Node)(nodoAux.getBranches().get(0));
		System.out.println(aux.get_Data());
		

	}

}
