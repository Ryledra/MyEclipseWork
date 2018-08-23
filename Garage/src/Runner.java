
public class Runner {
	public static void main(String[] args)	{
		Garage garage = new Garage("C:\\Users\\Admin\\Desktop\\EclipseWorkspace\\Garage\\src\\garage.txt");
		
		for (Vehicle i : garage.garage)	{
			if (i instanceof Car)	System.out.println((Car)i);
			else if (i instanceof Motorcycle)	System.out.println((Motorcycle)i);
		}
		
		System.out.println();
		
		System.out.println("Storage cost for today is £" + garage.calcStorageCost());
		
		garage.empty();
		
		for (Vehicle i : garage.garage)	{
			if (i instanceof Car)	System.out.println((Car)i);
			else if (i instanceof Motorcycle)	System.out.println((Motorcycle)i);
		}
	}
}
