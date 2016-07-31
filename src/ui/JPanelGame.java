package ui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelGame extends JPanel {
	private Layer[] lies = null;

	public JPanelGame() {
			lies = new Layer[]{
					new LayerBackground(0, 0, 0, 0),
					new LayerDataBase(40, 32, 334, 279),
					new LayerDisk(40, 343, 334, 279),
					new LayerGame(414, 32, 334, 590),
					new LayerButton(788, 32, 334, 124),
					new LayerNext(788, 188, 176, 148),
					new LayerLevel(964, 188, 158, 148),
					new LayerPoint(788, 368, 334, 200)
			};
		}

	@Override
	public void paintComponent(Graphics g) {
		//循环刷新游戏界面
			for (int i = 0; i < lies.length; i++) {
				//刷新新窗口
				lies[i].paint(g);
			}
	}
}
