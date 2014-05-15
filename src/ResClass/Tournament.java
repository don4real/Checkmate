package ResClass;

public class Tournament 
{
	Player player;
	Player opponent;
	
	int scorePlayer;
	int scoreOpponent;
	
	String colorPlayer;
	String colorOpponent;
	
	public Tournament(Player player) 
	{
		this.player = player;
	}
	
	public Tournament(Player player, Player opponent) 
	{
		this.player = player;
		this.opponent = opponent;
	}

	public Tournament(Player player, Player opponent, int scorePlayer,
			int scoreOpponent, String colorPlayer, String colorOpponent) 
	{
		this.player = player;
		this.opponent = opponent;
		this.scorePlayer = scorePlayer;
		this.scoreOpponent = scoreOpponent;
		this.colorPlayer = colorPlayer;
		this.colorOpponent = colorOpponent;
	}
	
	
		
}
