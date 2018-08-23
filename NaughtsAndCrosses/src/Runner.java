import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Boolean cont = true;
		String yesOrNo;
		Scanner scan = new Scanner(System.in);

		while (cont) { // loop to allow game to be played again
			Game game = new Game();
			game.runGame();
			System.out.println("Would you like to play again? [y/n] ");

			yesOrNo = scan.nextLine();
			if (!yesOrNo.equals("y"))
				cont = false;
		}
		scan.close();
	}
}
