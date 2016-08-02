package config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author fudian_tangdp
 *Game Config 
 */
public class GameConfig {
    
    /**
     * width of window
     */
    private int width;
    /**
     * height of window
     */
    private int height;
    /**
     * the size of window
     */
    private int windowSize;
    /**
     * the padding inside window
     */
    private int padding;
    
    private String title;
    
    private int windowUp;
    /**
     * the attribute of layer
     */
    private List<LayerConfig> layersConfig;
    
    /**
     * @throws Exception
     * Constructor function of GameConfig
     */
    public GameConfig() throws Exception {
        //Create a XML reader
        SAXReader read = new SAXReader();//XML Reader
        //read XML file
        Document doc = read.read("config/cfg.xml");//read from cfg.xml to doc
        //Get the root of XML
        Element game = doc.getRootElement();
        //Config Window parameters
       this.setUiConfig(game.element("frame"));
       //config  system parameters
       this.setSystemConfig(game.element("system"));
       //config data parameters
       this.setDataConfig(game.element("data"));

    }
    
    /**
     * @param frame
     * 配置文件的窗口配置元素
     */
    private void setUiConfig(Element frame){
        this.width = Integer.parseInt(frame.attributeValue("width"));
        this.height = Integer.parseInt(frame.attributeValue("height"));
        this.windowSize  = Integer.parseInt(frame.attributeValue("windowSize"));
        this.padding = Integer.parseInt(frame.attributeValue("padding"));
        this.title = frame.attributeValue("title");
        this.windowUp = Integer.parseInt(frame.attributeValue("windowUp"));
        List<Element> layers = frame.elements("Layer");
        layersConfig = new ArrayList<LayerConfig>();
        for (Element layer : layers) {
            LayerConfig lc = new LayerConfig(
                layer.attributeValue("className"),
                Integer.parseInt(layer.attributeValue("x")),
                Integer.parseInt(layer.attributeValue("y")),
                Integer.parseInt(layer.attributeValue("w")),
                Integer.parseInt(layer.attributeValue("h")));
        layersConfig.add(lc);
        }
    }
    
    private void setSystemConfig(Element frame){
        //TODO 配置系统参数
    }
    
    private void setDataConfig(Element frame){
        //TODO 配置数据访问参数
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public int getPadding() {
        return padding;
    }
    
    public String getTitle() {
		return title;
	}

	public int getWindowUp() {
		return windowUp;
	}

	public List<LayerConfig> getLayersConfig() {
        return layersConfig;
    }
    
}
