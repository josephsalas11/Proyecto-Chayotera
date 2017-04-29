package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Cogollo extends Figure{
	

	private double _Diameter;
	
	
	//Constructor
	public Cogollo(int _CoorX, int _CoorY, Color _Color,  double p_Diameter)
	{
		super(_CoorX, _CoorY, _Color);
		this._Diameter = p_Diameter;
	}

	
	public void paint(Graphics g)
	{
		
		
        
		g.drawLine(_CoorX+3, _CoorY+3, _CoorX+40, _CoorY+40);
		g.drawOval(_CoorX+19, _CoorY+19, (int)_Diameter, (int)_Diameter);
		g.setColor(new Color(45,85,5));
		g.fillOval(_CoorX+19, _CoorY+19, (int)_Diameter, (int)_Diameter);

	}


	
	
		

//Getters and Setters

	public double get_Diameter() {
		return _Diameter;
	}


	public void set_Diameter(double _Diameter) {
		this._Diameter = _Diameter;
	}


	public void setType(boolean type) {
		super.setType(type);
		
	}
	

}
