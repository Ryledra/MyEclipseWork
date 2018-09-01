
public class Runner {

	public static void main(String[] args) {
		String str = "hello my friends";
		Printing print = new Printing();

		print.printing1(str);
		System.out.println("\n");
		print.printing2(str);
		
		
		try {
			if (str.split(" ")[0].equals("hello")) {
				QAEx qe = new QAEx();
				throw qe;
			}
		} catch (QAEx qe) {
			System.out.println(qe);
		}
	}

}
