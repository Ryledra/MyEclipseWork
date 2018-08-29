
public class MapManager {
	
	
	private Player[] players = {new Player(1,10)/*, new Player(2,10)*/};
	
	// Phase 1 - set up ships
	public boolean placeShips()	{
		for (Player p : players)	{
			
			System.out.println("Player " + p.getPlayerNo() + ", it's your turn to place your ships:");
			p.placeShips();
		}
		return false;
	}
	
}
