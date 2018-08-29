import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private int playerNo;
	private Grid grid;
	private ArrayList<Ship> ships = new ArrayList<>();
	
	public Player(int playerNo, int gridSize)	{
		this.playerNo = playerNo;
		grid = new Grid(gridSize);
	}
	
	public boolean placeShips() {
		
		String[] ships = {"2,patrol1","2,patrol2"}; //{ship length, shipID}
		String input = "";
		
		for (String i : ships)	{
			
			int[] pos = {0,0};
			String[] parts = i.split(",");
			int orientation = 0;
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String[] partsInput;
			
			do	{
				System.out.println(grid.placingShips(pos, orientation, Integer.valueOf(parts[0]))); // update with potential ship
				System.out.print("What do you want to do? ");
				input = scan.nextLine();
				partsInput = input.split(" ");
				if (input.equals("rotate"))	{
					orientation = (orientation + 1) % 4;
				} else if (partsInput[0].equals("move"))	{
					if (partsInput.length < 3)	System.out.println("Please enter a value.");
					else if(partsInput[1].equals("left")) pos[1] = ((((pos[1] - Integer.valueOf(partsInput[2])) % grid.gridSize) + grid.gridSize) % grid.gridSize);
					else if(partsInput[1].equals("right")) pos[1] = (pos[1] + Integer.valueOf(partsInput[2])) % grid.gridSize;
					else if(partsInput[1].equals("up")) pos[0] = ((((pos[0] - Integer.valueOf(partsInput[2])) % grid.gridSize) + grid.gridSize) % grid.gridSize);
					else if(partsInput[1].equals("down")) pos[0] = (pos[0] + Integer.valueOf(partsInput[2])) % grid.gridSize;
				}
			} while (!partsInput[0].equals("set")); 
			
			this.ships.add(new Ship(pos, orientation, Integer.valueOf(parts[0]), parts[1])); 
			for (int j = 0; j < Integer.valueOf(parts[0]); j++)	{
				switch (orientation)	{
				case 0: // down
					grid.getSea()[pos[0]+j][pos[1]].setContainsShip(true);
					break;
				case 1: // right
					grid.getSea()[pos[0]][pos[1]+j].setContainsShip(true);
					break;
				case 2: // up 
					grid.getSea()[pos[0]-j][pos[1]].setContainsShip(true);
					break;
				case 3: // left
					grid.getSea()[pos[0]][pos[1]-j].setContainsShip(true);
					break;
				}
			}
		}
		//System.out.println(grid.placingShips());
		return true;
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public Grid getGrid() {
		return grid;
	}

	public ArrayList<Ship> getShips() {
		return ships;
	}
	
}
