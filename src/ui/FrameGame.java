package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameGame extends JFrame {
		public FrameGame() {
			//Set title
			this.setTitle("Java Russian Tetris");
			//Set default close attribute;
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Set the size of  windows
			this.setSize(1172, 676);
			//Not allow user to change the size of windows
			this.setResizable(false);
			//Put the window in the center of Screen
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Dimension  screen =  toolkit.getScreenSize();
			int x = (screen.width-this.getWidth())/2;
			int y = (screen.height-this.getHeight())/2-32;
			this.setLocation(x,y);
			//Set default Panel
			this.setContentPane(new PanelGame());
		}
}
