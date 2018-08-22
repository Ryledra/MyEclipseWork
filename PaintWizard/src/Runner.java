
public class Runner {

	public static void main(String[] args) {
		
		 double[][] prices = {{19.99,20,10},{11.99,15,11},{25,10,20}};
		 String[] names = {"CheepoMax","AverageJoes","DuluxourousPaints"};
		 PaintWizard wiz = new PaintWizard();
		 System.out.println(wiz.getCheepest(prices, names, 5));


	}

}
