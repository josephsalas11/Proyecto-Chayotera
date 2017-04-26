package ui;

import java.awt.Color;
import java.awt.Graphics;

public class Chayote {


	private double _Diameter;
	private  int _CoorX;
	private int _CoorY;
	private Color _Color;
	
	
	
	public Chayote(int p_CoorX, int p_CoorY, Color p_Color,  double p_Diameter)
	{
		this._CoorX = p_CoorX;
		this._CoorY = p_CoorY;
		this._Color = p_Color;
		this._Diameter = p_Diameter;
	}
	
	

	public void paint(Graphics g)
	{
		g.drawOval(_CoorX, _CoorY, (int)_Diameter, (int)_Diameter);
		g.setColor(this._Color);
		g.fillOval(_CoorX, _CoorY, (int)_Diameter+1, (int)_Diameter+1);
	}
	
	
@Override
	public String toString() {
		return "Chayote [_Diameter=" + _Diameter +  ", _CoorX=" + _CoorX + ", _CoorY=" + _CoorY
				+ "]";
	}

//Getters and Setters
	public double get_Diameter() {
		return _Diameter;
	}
	public void set_Diameter(double _Diameter) {
		this._Diameter = _Diameter;
	}

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
