
public class Runner {

	public static void main(String[] args) {
		String str = "hello my friends";
		Printing print = new Printing();
		
		
		try {
			if (str.split(" ")[0].equals("hello")) {
				throw new QAEx();
			} else	{
				print.printing1(str);
				System.out.println("\n");
				print.printing2(str);
			}
		} catch (QAEx qe) {
			System.out.println(qe);
		}
	}

}
