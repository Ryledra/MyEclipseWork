public class Space {
	private Porridge porridge;
	private Chair chair;
	private int luminosity;
	private int spaceNumber;
	
	public Space(int cap, int temp, int lum, int spaceNo)	{
		this.chair = new Chair(cap);
		this.porridge = new Porridge(temp);
		this.luminosity = lum;
		this.spaceNumber = spaceNo;
	}
	
	public int getChairCap()	{
		return chair.getCapacity();
	}
	
	public int getPorridgeTemp()	{
		return porridge.getTemperature();
	}
	
	public int getLuminosity()	{
		return luminosity;
	}
	
	public int getSpaceNo()	{
		return spaceNumber;
	}
}
