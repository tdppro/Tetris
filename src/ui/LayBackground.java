package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayBackground extends Lay {

	private static Image IMG_GB = new ImageIcon("graphics/background/bg01.jpg").getImage();

	protected LayBackground(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(IMG_GB,0, 0, 1162,654,null);
	}

}
