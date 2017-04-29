package logic;

import java.awt.Canvas;
import java.awt.Color;
import java.util.Random;

import ui.Chayote;
import ui.ChayoteCanvas;
import ui.Figure;
import ui.Light;
import ui.Root;
import ui.Cogollo;

public class Process extends Thread{
	
	private Canvas canvas;
	private int harvest = 0;
	private N_aryTree littleTree;
	private Root initialRoot;
	private int x = 20;
	private int y = 20;

	//Constructor
	public Process(Canvas canvas)
	{
		super("canvas");
		this.canvas = canvas;

		randomValue();
		littleTree = N_aryTree.getSingletonInstance(randomValue());
		initialRoot = (Root) littleTree.getRoot().get_Data();
		initialRoot.paint(canvas.getGraphics());
	}
	
		
	public int randomValue()
	{
		Random r = new Random();
		int Low = 2;
		int High = 7;
		int Result = r.nextInt(High-Low) + Low;
		return Result;
	}
	
	public int randomProbability()
	{
		int randomHarvest = (int) Math.floor(Math.random()*100+1);
		return randomHarvest;
	}
	
	
	public void run(int cantChayotes, int probability, int chayotesPerSecond) throws InterruptedException 
	{		
		//Create and insert Chayote Nodes and Cogollo Nodes
		Node cogolloNode = new Node(new Cogollo(x,y, new Color(56,40,5), 30.85));
		cogolloNode.setLimit(6);	
		littleTree.recAddChild(littleTree.getRoot(), cogolloNode);
		Figure figureCogollo = (Figure)cogolloNode.get_Data();
		Thread.sleep((chayotesPerSecond)*1000);
		figureCogollo.paint(canvas.getGraphics());
		
		while(harvest< cantChayotes)
		{
			int randomProba = randomProbability();
			int randomVal = randomValue();
			
			if(randomProba> probability)
			{
				Cogollo cogollito =new Cogollo(x+20,x+20, new Color(56,40,5), 30.85);
				cogollito.setType(false);
				Node cogolloNode2 = new Node(cogollito);
				cogolloNode2.setLimit(6);
				littleTree.recAddChild(littleTree.getRoot(), cogolloNode2);
				Figure figureCogollo2 = (Figure)cogolloNode2.get_Data();
				figureCogollo2.paint(canvas.getGraphics());
				Thread.sleep((chayotesPerSecond)*1000);
			}
			else
			{
				Node chayoteNode =new Node(new Chayote(x+=30, y+=10, Color.GREEN,  30.85));
				chayoteNode.setArrayLoc(false);
				Figure figureChayote = (Figure)chayoteNode.get_Data();
				littleTree.recAddChild(littleTree.getRoot(), chayoteNode);
				figureChayote.paint(canvas.getGraphics());
				Thread.sleep((chayotesPerSecond)*1000);
				harvest++;
				if (harvest ==cantChayotes)
				{
					Light Finish = new Light(500,400, Color.GREEN, 100,100);
					Finish.paint(canvas.getGraphics());
					
				}
			}
		}
		
	}
	
	
	
	
	
}
