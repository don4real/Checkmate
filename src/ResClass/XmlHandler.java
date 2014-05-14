package ResClass;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlHandler extends DefaultHandler {

	//List to hold Players object
	private List<Player> playerList = null;
	//private Employee emp = null;
	private Player player;

	boolean fideid = false;
	boolean name = false;
	boolean sex = false;
	boolean country = false;
	boolean rating = false;
	boolean k = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes)
			throws SAXException {

		if (qName.equalsIgnoreCase("player")) {
			//create a new Player 
			player = new Player();

			//initialize list
			if (playerList == null)
				playerList = new ArrayList<Player>();
		} else if (qName.equalsIgnoreCase("name")) {
			//set boolean values for fields, will be used in setting Employee variables
			name = true;
		} else if (qName.equalsIgnoreCase("fideid")) {
			fideid = true;
		} else if (qName.equalsIgnoreCase("sex")) {
			sex = true;
		} else if (qName.equalsIgnoreCase("country")) {
			country = true;
		} else if (qName.equalsIgnoreCase("rating")) {
			rating = true;
		} else if (qName.equalsIgnoreCase("k")) {
			k = true;
		}
		
	}


	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("player")) {
			//add Employee object to list
			playerList.add(player);
			
		}
		
	}


	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		
		if (fideid) {
			//age element, set Employee age
			player.setFideid(Integer.parseInt(new String(ch, start, length)));
			fideid = false;
		} else if (name) {
			player.setName(new String(ch, start, length));
			name = false;
		} else if (country) {
			player.setCountry(new String(ch, start, length));
			country = false;
		} else if (sex) {
			player.setSex(new String(ch, start, length));
			sex = false;
		} else if (rating) {
			player.setRating(Integer.parseInt(new String(ch, start, length)));
			rating = false;
		} else if (k) {
			player.setK(Integer.parseInt(new String(ch, start, length)));
			k = false;
		}
		

	}


	public List<Player> getPlayerList() {
		return playerList;
	}


	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
}

