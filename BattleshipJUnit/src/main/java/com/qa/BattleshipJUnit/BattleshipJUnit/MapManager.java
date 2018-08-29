package com.qa.BattleshipJUnit.BattleshipJUnit;

public class MapManager {
	
	String[] ships = {"2,patrol1","2,patrol2","3,battleship1","3,battleship2","3,submarine","4,destroyer","5,carrier"};
	private Player[] players = {new Player(1,10)/*, new Player(2,10)*/};
	
	// Phase 1 - set up ships
	public boolean placeShips()	{ //{ship length, shipID}
		
		for (Player p : players)	{
			System.out.println("Player " + p.getPlayerNo() + ", it's your turn to place your ships:");
			if (p.placeShips(ships));
			else return false;
		}
		return true;
	}
}
 