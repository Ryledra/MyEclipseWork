
public class PaintWizard {
//	public double[][] prices = {{19.99,20,10},{11.99,15,11},{25,10,20}};
//	public String[] names = {"CheepoMax","AverageJoes","DuluxourousPaints"};
	
	public String getCheepest(double[][] prices, String[] names, int roomSize)	{
		// prices {cost, vol, m2}
		double[][] costRoom = new double[prices.length][3]; // {cost, buckets, areaCovered}
		int min = 0;
		
		for (int i = 0; i < prices.length; i++)	{
			while (costRoom[i][2] < roomSize)	{
				costRoom[i][0] += prices[i][0];
				costRoom[i][1]++;
				costRoom[i][2] += prices[i][2];
			}
		}
		for (int i = 0; i < costRoom.length; i++)	{
			if (costRoom[i][0] < costRoom[min][0]) min = i;
		}
		return names[min];
	}	
}
