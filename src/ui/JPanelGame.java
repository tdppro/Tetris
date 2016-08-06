package ui;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;
import control.PlayerControl;
import dto.GameDto;

public class JPanelGame extends JPanel {
	private ArrayList<Layer> layers = null;
	private GameDto dto;
	public JPanelGame( GameDto dto) {
	    //获得dto对象
	    this.dto = dto;
		initComponet();
		initLayer();
		}
	
	/**
	 * @param control
	 * 玩家控制器
	 */
	public void setGameControl(PlayerControl control){
	    this.addKeyListener(control);
	    }
	
	private void initComponet(){
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
				Layer layer = (Layer)ctr.newInstance(layerCfg.getX(),layerCfg.getY(),layerCfg.getW(),layerCfg.getH());
				//设置游戏数据对象
				layer.setDto(dto);
				//增加游戏图层
				layers.add(layer);
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
