
public class Motorcycle extends Vehicle	{
	
	public Motorcycle(String reg)	{
		this.reg = reg;
		this.broken = false;
		this.fixCost = 50;
		this.storageCost = 2;
	}
	
	public String makeSound()	{
		return "Buzz...";
	}
	
	public String avoidTraffic()	{
		return "Move between vehicles";
	}

	public String toString()	{
		return "I am a motorcycle with RegNo: " + this.reg;
	}
}
