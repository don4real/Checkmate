package ResClass;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Main {

	/**
	 * @param args
	 */
	private static final String PATH = System.getProperty("user.dir") + "/assets/standard_rating_list_xml.xml";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		
		try {
			SAXParser saxParser = saxParserFactory.newSAXParser();
			XmlHandler handler = new XmlHandler();
			saxParser.parse(new File(PATH), handler);
			//Get Employees list
			List<Player> playerList = handler.getPlayerList();			//print employee information
			for(Player player : playerList)
				System.out.println(player);
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}
}

