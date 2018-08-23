import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GoldilocksLuminosity {
	public ArrayList<int[]> inArray = new ArrayList<>();
	public int weight;
	public int temperature;
	public int luminosity = 70;
	
	public GoldilocksLuminosity()	{
		File file = new File("C:\\Users\\Admin\\Desktop\\Eclipse Workspace\\Goldilocks\\src\\goldilocks3.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		
		String readLine = "";
		int count = 0;
		
		do	{
			try {
				readLine = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (readLine == null) break;
			String[] parts = readLine.split(" ");
			if (count == 0)	{
				this.weight = Integer.parseInt(parts[0]);
				this.temperature = Integer.parseInt(parts[1]);
			}
			else	{
				int[] partsInt = {Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2])};
				this.inArray.add(partsInt);
			}
			count++;
		} while (readLine != null);
	}
	
	public Boolean valid(int[] capTemp)	{
		if (this.weight < capTemp[0] && this.temperature > capTemp[1] && this.luminosity < capTemp[2]) return true;
		return false;
	}
	
	public String willSit()	{
		String output = "";
		int count = 1;
		for (int[] i : this.inArray)	{
			if (valid(i)) output += (count + " ");
			count++;
		}
		return output;
	}
}
