
public class Runner {

	public static void main(String[] args) {
		//Goldilocks blonde = new Goldilocks();
		//GoldilocksLuminosity blonde = new GoldilocksLuminosity();
		GoldilocksObjects blonde = new GoldilocksObjects("C:\\\\Users\\\\Admin\\\\Desktop\\\\EclipseWorkspace\\\\Goldilocks\\\\src\\\\goldilocks3.txt");
		// System.out.println(blonde.weight);
		
//		for (int[] i : blonde.inArray)	{
//			System.out.println(i[0]);
//		}
		System.out.println(blonde.willSit());
	}
}
