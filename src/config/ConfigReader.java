package config;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ConfigReader {
    
    public static void readConfig() throws Exception{
        SAXReader read = new SAXReader();//XML Reader
        Document doc = read.read("config/cfg.xml");//read from cfg.xml to doc
        Element game = doc.getRootElement();
        Element frame = game.element("frame");
        List<Element> layers = frame.elements();
        for (Element layer : layers) {
            System.out.println(layer.attribute("class"));
            System.out.println(layer.attributeValue("class"));
        } 
    }
    
    public static void main(String[] args) throws Exception {
        readConfig();
    }
}
