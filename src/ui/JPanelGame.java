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
	    //���dto����
	    this.dto = dto;
		initComponet();
		initLayer();
		}
	
	/**
	 * @param control
	 * ��ҿ�����
	 */
	public void setGameControl(PlayerControl control){
	    this.addKeyListener(control);
	    }
	
	private void initComponet(){
	}
	/**
	 * ��ʼ����
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
				//������Ϸ���ݶ���
				layer.setDto(dto);
				//������Ϸͼ��
				layers.add(layer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		//���û��෽��
		super.paintComponent(g);
		//ѭ��ˢ����Ϸ����
			for (int i = 0; i < layers.size(); i++) {
				//ˢ���´���
				layers.get(i).paint(g);
			}
			//���ؽ���
			this.requestFocus();
	}
}
