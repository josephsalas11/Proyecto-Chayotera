package ui;

import java.awt.Color;
import java.awt.Graphics;

public class Chayote extends Figure{


	private double _Diameter;
	
	public Chayote(int _CoorX, int _CoorY, Color _Color,  double p_Diameter)
	{
		super(_CoorX, _CoorY, _Color);
		this._Diameter = p_Diameter;
	}
	
	

	public void paint(Graphics g)
	{
		g.drawOval(_CoorX, _CoorY, (int)_Diameter, (int)_Diameter);
		g.setColor(Color.green);
		g.fillOval(_CoorX, _CoorY, (int)_Diameter+1, (int)_Diameter+1);
	}
	
	
//Getters and Setters
	public double get_Diameter() {
		return _Diameter;
	}
	public void set_Diameter(double _Diameter) {
		this._Diameter = _Diameter;
	}


}
