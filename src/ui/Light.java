package ui;

import java.awt.Color;
import java.awt.Graphics;

public class Light extends Figure {
	
	private double _Width;
	private double _Height;
	
	public Light(int _coorX, int _coorY, Color _Color ,double p_Width, double p_Height)
	{
		super(_coorX, _coorY, _Color);
		this._Width = p_Width;
		this._Height = p_Height;
	}
	
	
	
	
	public void paint(Graphics g)
	{
		g.drawRect(_CoorX, _CoorY, (int)_Width, (int)_Height);
		g.setColor(Color.green);
		g.fillRect(_CoorX, _CoorY, (int)_Width+1, (int)_Height+1);
	}
	
	
	


	public double get_Width() {
		return _Width;
	}

	public void set_Width(double _Width) {
		this._Width = _Width;
	}

	public double get_Height() {
		return _Height;
	}

	public void set_Height(double _Height) {
		this._Height = _Height;
	}

}
