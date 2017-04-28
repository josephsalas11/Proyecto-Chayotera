package logic;

import java.awt.Canvas;
import java.awt.Color;

import ui.Chayote;
import ui.ChayoteCanvas;
import ui.Figure;
import ui.Root;

public class Process extends Thread{
	
	private Canvas canvas;

	public Process(Canvas canvas)
	{
		super("canvas");
		this.canvas = canvas;
	}
	
	public void run()
	{
		int randomValue = (int) Math.floor(Math.random()*6+1);
		N_aryTree littleTree = N_aryTree.getSingletonInstance(randomValue);
		Root aux = (Root) littleTree.getRoot().get_Data();
		Node nodoPrueba =new Node(new Chayote(20, 20, Color.GREEN,  30.85));
		aux.paint(canvas.getGraphics());
		littleTree.recAddChild(littleTree.getRoot(), nodoPrueba);
		Figure au = (Figure)nodoPrueba.get_Data();
		au.paint(canvas.getGraphics());
	}
}
