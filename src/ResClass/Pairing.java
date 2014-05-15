package ResClass;

import java.util.ArrayList;
import java.util.List;

public class Pairing 
{
	List<Player> players = new ArrayList<Player>();	
	int amountOfPlayers = players.size();
	
	public int FirstRound(int playerID)
	{
		int opponentID;
		
		if(amountOfPlayers%2==0) // IS EVEN ODD OF PLAYERS (coz it starts from 0...)
		{
			int bye = (int) ((Math.random() * ((amountOfPlayers - 1) - 0)) + 0);
			amountOfPlayers--;
		}
		
		opponentID = playerID + amountOfPlayers/2;
		
		return opponentID;
		
	}
}
