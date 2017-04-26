package ui;

import java.awt.Color;
import java.awt.Graphics;

public class Root {
	
	private  int _CoorX;
	private int _CoorY;
	private double _Base;
	private double _Height;
	

	public Root(int p_CoorX, int p_CoorY,  double p_Base, double p_Height)
	{
		this._CoorX = p_CoorX;
		this._CoorY = p_CoorY;
		this._Base = p_Base;
		this._Height = p_Height;
	}
		
	
	public void paint(Graphics g)
	{
		g.drawLine(_CoorX, _CoorY, (int)(_CoorX+(_Base/2)), (int)(_CoorY+_Height));
		g.setColor(new Color(56,40,5));
		g.drawLine((int)(_CoorX+(_Base/2)), (int)(_CoorY+_Height), (int) (_CoorX-(_Base/2)), (int) (_CoorY+_Height));
		g.setColor(new Color(56,40,5));
		g.drawLine(_CoorX,_CoorY,(int)(_CoorX-(_Base/2)), (int)(_CoorY+_Height));
		g.setColor(new Color(56,40,5));
	}
	
	
@Override
	public String toString() {
		return "Branch [_CoorX=" + _CoorX + ", _CoorY=" + _CoorY + ", _Base=" + _Base + ", _Height=" + _Height + "]";
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
