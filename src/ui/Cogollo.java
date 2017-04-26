package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Cogollo {
	
	private  int _CoorX;
	private int _CoorY;
	private Color _Color;
	private double _Diameter;
	
	public Cogollo(int p_CoorX, int p_CoorY, Color p_Color)
	{
		this._CoorX = p_CoorX;
		this._CoorY = p_CoorY;
		this._Color = p_Color;
	}

	
	public void paint(Graphics g)
	{
		g.drawLine(_CoorX, _CoorY, _CoorX+50, _CoorY+50);
		g.drawOval(_CoorX+40, _CoorY+40, (int)_Diameter, (int)_Diameter);
		g.setColor(this._Color);
	}
	
	
	
	
	

//Getters and Setters
	public int get_CoorX() {
		return _CoorX;
	}

	public void set_CoorX(int _CoorX) {
		this._CoorX = _CoorX;
	}

	public int get_CoorY() {
		return _CoorY;
	}

	public void set_CoorY(int _CoorY) {
		this._CoorY = _CoorY;
	}

	public Color get_Color() {
		return _Color;
	}

	public void set_Color(Color _Color) {
		this._Color = _Color;
	}
	

}
