package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Root extends Figure{
	
	private double _Base;
	private double _Height;
	

	public Root(int _CoorX, int _CoorY, Color _Color, double p_Base, double p_Height)
	{
		super(_CoorX, _CoorY, _Color);
		this._Base = p_Base;
		this._Height = p_Height;
	}
		
	
	public void paint(Graphics g)
	{
		
		int xPoly[] = {15, 25, 32, 37, 45, 27};
        int yPoly[] = {15, 10, 12, 22, 25, 37};
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
		g.setColor(new Color(56,40,5));
        g.drawPolygon(poly);
        g.fillPolygon(poly);

	}
	
	
	//Getters and Setters
	
	
	public double get_Base() {
		return _Base;
	}
	public void set_Base(double _Base) {
		this._Base = _Base;
	}
	public double get_Height() {
		return _Height;
	}
	public void set_Height(double _Height) {
		this._Height = _Height;
	}
	

}
