
public class Runner {
	public static void main(String[] args)	{
		Garage garage = new Garage("C:\\Users\\Admin\\Desktop\\EclipseWorkspace\\Garage\\src\\garage.txt");
		
		for (Vehicle i : garage.garage)	{
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("Storage cost for today is £" + garage.calcStorageCost());
		
		garage.empty();
		
		for (Vehicle i : garage.garage)	{
			System.out.println(i);
		}
	}
}
