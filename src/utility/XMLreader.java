package utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;

import org.dom4j.io.SAXReader;

import controller.GameControl;

public class XMLreader {
	public static void iniWall() throws Exception {

		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("src/res/untitled.xml"));


		Element conElem = doc.getRootElement().element("layer");

		List<Element> conElem2 = doc.getRootElement().elements("layer");
		
			Element ele = conElem2.get(2).element("data");
			String string = ele.getText();
			System.out.println(string);
			String[] xStrings = string.split(",");
			List<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < xStrings.length; i++) {
				//System.out.println(xStrings[i]);
				if ((!xStrings[i].contains("0"))) {
					
					temp.add(i+1);
				}
				
			}
			for (int i = 0; i < temp.size(); i++) {
				System.out.println(temp.get(i));
			}
			GameControl.wall = temp.stream().mapToInt(Integer::intValue).toArray();
		
		


	}
}
