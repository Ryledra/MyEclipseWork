
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
		
		String out = "X A B C D E F G H I J\n";
		for (int i = 0; i < gridSize; i++)	{
			out += i + " ";
			for (int j = 0; j < gridSize; j++)	{
				if(sea[i][j].isContainsShip()) out += "x";
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
