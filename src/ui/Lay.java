package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * @author tdp draw windows
 */
public abstract class Lay {
	private static final int SIZE = 7;
	protected static final int PADDING = 16;

	private static Image WINDOW_IMG = new ImageIcon("graphics/window/Window.png").getImage();
	private static int WINDOW_W = WINDOW_IMG.getWidth(null);
	private static int WINDOW_H = WINDOW_IMG.getHeight(null);
	/**
	 * X-coordinate of the upper left corner of the window
	 */
	protected int x;
	/**
	 * Y-coordinate of the upper left corner of the window
	 */
	protected int y;
	/**
	 * width of window
	 */
	protected int w;
	/**
	 * Height of window
	 */
	protected int h;

	protected Lay(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/**
	 * draw windows
	 */
	protected void createWindow(Graphics g) {
		// left of up
		g.drawImage(WINDOW_IMG, x, y, x + SIZE, y + SIZE, 0, 0, SIZE, SIZE, null);
		// center of up
		g.drawImage(WINDOW_IMG, x + SIZE, y, x + w - SIZE, y + SIZE, SIZE, 0, WINDOW_W - SIZE, SIZE, null);
		// right of up
		g.drawImage(WINDOW_IMG, x + w - SIZE, y, x + w, y + SIZE, WINDOW_W - SIZE, 0, WINDOW_W, SIZE, null);
		// left of center
		g.drawImage(WINDOW_IMG, x, y + SIZE, x + SIZE, y + h - SIZE, 0, SIZE, SIZE, WINDOW_H - SIZE, null);
		// center
		g.drawImage(WINDOW_IMG, x + SIZE, y + SIZE, x + w - SIZE, y + h - SIZE, SIZE, SIZE, WINDOW_W - SIZE,
				WINDOW_H - SIZE, null);
		// right of center
		g.drawImage(WINDOW_IMG, x + w - SIZE, y + SIZE, x + w, y + h - SIZE, WINDOW_W - SIZE, SIZE, WINDOW_W,
				WINDOW_H - SIZE, null);
		// left of down
		g.drawImage(WINDOW_IMG, x, y + h - SIZE, x + SIZE, y + h, 0, WINDOW_H - SIZE, SIZE, WINDOW_H, null);
		// center of down
		g.drawImage(WINDOW_IMG, x + SIZE, y + h - SIZE, x + w - SIZE, y + h, SIZE, WINDOW_H - SIZE, WINDOW_W - SIZE,
				WINDOW_H, null);
		// right of down
		g.drawImage(WINDOW_IMG, x + w - SIZE, y + h - SIZE, x + w, y + h, WINDOW_W - SIZE, WINDOW_H - SIZE, WINDOW_W,
				WINDOW_H, null);

	}

	/**
	 * flush the content of game
	 * 
	 * @param g
	 */
	abstract public void paint(Graphics g);
}
