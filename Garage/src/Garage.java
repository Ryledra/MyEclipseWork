import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Garage {
	public ArrayList<Vehicle> garage = new ArrayList<>();
	
	public Garage(String filePath)	{
		File file = new File(filePath);
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		String readLine = "";
		
		try {
			readLine = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (readLine != null)	{
			String[] parts = readLine.split(",");
			//System.out.println(parts[0]);

			this.addVehicle(parts[0], parts[1]);
			
			try {
				readLine = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int calcStorageCost()	{
		int storageCost = 0;
		for (Vehicle i : garage)	{
			storageCost += i.getStorageCost();
		}
		return storageCost;
	}
	
	public void addVehicle(String type, String regNo)	{
		if (type.equals("Car")) garage.add(new Car(regNo));
		else if (type.equals("Motorcycle")) garage.add(new Motorcycle(regNo));
	}
	
	public void removeVehicle(String input)	{
		if (input.equals("Car") || input.equals("Motorcycle"))	{
			for (int i = garage.size()-1; i >= 0; i--)	{
				if (garage.get(i) instanceof Car && input.equals("Car"))	garage.remove(garage.get(i));
				else if (garage.get(i) instanceof Motorcycle && input.equals("Motorcycle"))	garage.remove(garage.get(i));
			}
		}
		else	{
			for (Vehicle i : garage)	{
				if (i.getReg().equals(input))	{
					garage.remove(i);
					break;
				}
			}
		}
	}
	
	public void empty()	{
		for (int i = garage.size()-1; i >= 0; i--)	{
			garage.remove(garage.get(i));
		}
	}
}
