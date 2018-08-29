package com.qa.BattleshipJUnit.BattleshipJUnit;

public class Grid {
	
	public int gridSize;
	private Space[][] sea;
	
	public Grid(int gridSize)	{
		this.gridSize = gridSize;
		sea  = new Space[gridSize][gridSize];
		for (int i = 0; i < gridSize; i++)	{
			for (int j = 0; j < gridSize; j++)	{
				sea[i][j] = new Space();
			}
		}
	}
	
	public String placingShips(int[] pos, int orientation, int shipLength)	{
		
		int[][] temp = new int[gridSize][gridSize];
		
		for (int i = 0; i < gridSize; i++)	{
			for (int j = 0; j < gridSize; j++)	{
				if (sea[i][j].isContainsShip()) temp[i][j] = 1;
				else temp[i][j] = 0;
			}
		}
		
		for (int j = 0; j < shipLength; j++)	{
			switch (orientation)	{
			case 0: // down
				temp[((pos[0]+j)+gridSize)%gridSize][pos[1]] = 2;
				break;
			case 1: // right
				temp[pos[0]][((pos[1]+j)+gridSize)%gridSize] = 2;
				break;
			case 2: // up 
				temp[((pos[0]-j)+gridSize)%gridSize][pos[1]] = 2;
				break;
			case 3: // left
				temp[pos[0]][((pos[1]-j)+gridSize)%gridSize] = 2;
				break;
			}
		}
		
		String out = "X A B C D E F G H I J\n";
		for (int i = 0; i < gridSize; i++)	{
			out += i + " ";
			for (int j = 0; j < gridSize; j++)	{
				if(temp[i][j] == 1) out += "x";
				else if (temp[i][j] == 2) out += "o";
				else out += "-";
				out += " ";
			}
			out += "\n";
		}
		return out;
	}
	
	public String toString()	{
		String out = "X A B C D E F G H I J\n";
		for (int i = 0; i < gridSize; i++)	{
			out += i + " ";
			for (Space j : sea[i])	{
				out += j + " ";
			}
			out += "\n";
		}
		return out;
	}

	public Space[][] getSea() {
		return sea;
	}

	public void setSea(Space[][] sea) {
		this.sea = sea;
	}
}
