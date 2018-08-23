
public class Car extends Vehicle	{
	
	public Car(String reg)	{
		this.reg = reg;
		this.broken = false;
		this.fixCost = 100;
		this.storageCost = 5;
	}
	
	public String makeSound()	{
		return "Beep, beep!";
	}
	
	public String avoidRain()	{
		return "I have a roof";
	}
	
	public String toString()	{
		return "I am a car with RegNo: " + this.reg;
	}

}
