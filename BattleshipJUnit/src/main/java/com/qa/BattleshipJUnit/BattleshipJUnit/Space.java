package com.qa.BattleshipJUnit.BattleshipJUnit;

public class Space {
	
	private enum spaceStatus	{
		unchecked, hit, miss
	}
	
	private boolean containsShip;
	private String shipID;
	public spaceStatus status;
	
	public Space()	{
		status = spaceStatus.unchecked;
	}
	
	public spaceStatus checkSpace()	{
		if (containsShip) status = spaceStatus.hit;
		else status = spaceStatus.miss;
		return status;
	}
	
	public void setContainsShip(boolean containsShip) {
		this.containsShip = containsShip;
	}

	public String toString()	{
		switch(status)	{
		case hit:
			return "X";
		case miss:
			return "O";
		default:
			return "-";
		}
	}

	public boolean isContainsShip() {
		return containsShip;
	}

	public String getShipID() {
		return shipID;
	}
}
