package ui;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;
import control.GameControl;
import control.PlayerControl;
import service.GameService;

public class JPanelGame extends JPanel {
	private ArrayList<Layer> layers = null;

	public JPanelGame() {
		initComponet();
		initLayer();
		}
	
	private void initComponet(){
		this.addKeyListener(new PlayerControl(new GameControl(this, new GameService())));
	}
	/**
	 * 初始化层
	 */
	private void initLayer(){
		try {
			GameConfig cfg = ConfigFactory.getGameConfig();
			// get layer config
			List<LayerConfig> layersCfg = cfg.getLayersConfig();
			//create game layer arrays
			layers = new  ArrayList<Layer>(layersCfg.size());
			for (LayerConfig layerCfg : layersCfg) {
				//Get Class Object
				Class<?>  c = Class.forName(layerCfg.getClassName());
				//Get Constructor 
				Constructor<?>  ctr = c.getConstructor(int.class,int.class,int.class,int.class);
				//Create the object through constructor
				Layer l = (Layer)ctr.newInstance(layerCfg.getX(),layerCfg.getY(),layerCfg.getW(),layerCfg.getH());
				layers.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		//调用基类方法
		super.paintComponent(g);
		//循环刷新游戏界面
			for (int i = 0; i < layers.size(); i++) {
				//刷新新窗口
				layers.get(i).paint(g);
			}
			//返回焦点
			this.requestFocus();
	}
}
