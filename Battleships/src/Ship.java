
public class Ship {
	private int[] position = new int[2];
	private int orientation;
	private int proportions;
	String shipID;
	
	public Ship(int[] position, int orientation, int proportions, String shipID)	{
		this.position = position;
		this.orientation = orientation;
		this.setProportions(proportions);
		this.shipID = shipID;
	}

	public int getProportions() {
		return proportions;
	}

	public void setProportions(int proportions) {
		this.proportions = proportions;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}
}
