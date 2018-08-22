import java.util.ArrayList;

public class Garage {
	public ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	public int calculateBill()	{
		int cost = 0;
		for (int i = 0; i < garage.size(); i++)	{
			if (garage.get(i).getClass().getSimpleName()== "Car") cost += 100;
			if (garage.get(i).getClass().getSimpleName()== "Motorcycle") cost += 50;
			if (garage.get(i).getClass().getSimpleName()== "Train") cost += 5000;
		}
		return cost;
	}
	
	public void removeVehicle(int reg)	{
		
	}
	
	public void removeVehicle(String type)	{
		
	}
	
	public int fixVehicle()	{
		
		return 0;
	}
	
	public void emptyGarage()	{
		garage.clear();
	}
}
