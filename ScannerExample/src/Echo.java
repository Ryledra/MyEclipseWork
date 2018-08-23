import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		
		while (!input.equals("exit"))	{
			System.out.print("Input: ");
			input = scan.nextLine();
			System.out.println("Output: " + input);
		}
	}
}
