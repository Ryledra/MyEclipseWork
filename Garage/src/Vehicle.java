
public abstract class Vehicle {

	protected Boolean broken;
	protected String reg;
	protected int fixCost;
	protected int storageCost;
	
	public abstract String makeSound();
	
	public String getReg()	{
		return this.reg;
	}
	
	public int fix()	{
		if (this.broken)	{
			this.broken = false;
			return this.fixCost;
		}
		else return 0;
	}
	
	public int getStorageCost()	{
		return this.storageCost;
	}
	
	public String toString()	{
		return "I'm here";
	}
}
