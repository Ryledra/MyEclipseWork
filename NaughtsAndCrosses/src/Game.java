import java.util.Scanner;

public class Game {

	Board game = new Board();

	public void runGame() {
		// function to control game
		// (player allocation & board functions)

		int i = 0;
		int player = 2;
		while (!game.check_win() && i < 9) {
			if (player == 1)
				player = 2;
			else
				player = 1;

			System.out.println(game);
			this.player_turn(player);

			i++;
		}
		System.out.println(game);
		if (!game.check_win())
			System.out.println("Game ends in a draw.");
		else
			System.out.println("Player " + player + " wins :D");
	}

	void player_turn(int player) {
		// retrieves input from player
		// passes input to Board::valid_go to check the space is available
		// held in loop until player gives valid space input

		int x, y;

		Scanner scan = new Scanner(System.in);

		System.out.print("Player " + player + " enter your go:[x,y]");
		String in = "";

		in = scan.nextLine();

		String[] parts = in.split(",");

		x = Integer.valueOf(parts[0]) - 1;
		y = Integer.valueOf(parts[1]) - 1;

		while (!game.valid_go(x, y, player)) {
			System.out.println(y + 1 + ", " + x + 1 + " is not a valid move");
			System.out.print("Player " + player + " enter your go:[x,y]");
			in = scan.nextLine();

			parts = in.split(",");

			x = Integer.getInteger(parts[0]) - 1;
			y = Integer.getInteger(parts[1]) - 1;
		}
	}
}
