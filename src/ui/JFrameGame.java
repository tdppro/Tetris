package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class JFrameGame extends JFrame {
		public JFrameGame() {
			GameConfig cfg = ConfigFactory.getGameConfig();
			//Set title
			this.setTitle(cfg.getTitle());
			//Set default close attribute;
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Set the size of  windows
			this.setSize(cfg.getWidth(), cfg.getHeight());
			//Not allow user to change the size of windows
			this.setResizable(false);
			//Put the window in the center of Screen
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Dimension  screen =  toolkit.getScreenSize();
			int x = (screen.width-this.getWidth())>>1;
			int y = (screen.height-this.getHeight()>>1)-cfg.getWindowUp();
			this.setLocation(x,y);
			//Set default Panel
			this.setContentPane(new JPanelGame());
		}
}
