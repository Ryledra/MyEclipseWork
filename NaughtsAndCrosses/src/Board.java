
public class Board {
	private int[][] board = new int[3][3];

	public Board() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.board[i][j] = 0;
			}
		}
	}

	private void player_go(int x, int y, int player) {
		// updates board element of players choice
		board[x][y] = player;
	}

	public Boolean valid_go(int x, int y, int player) {
		// checks that the space chosen by the player is not already used
		// passes true if space is empty or false if full.
		// passes input to Board::player_go to update board
		if (board[x][y] == 0) {
			player_go(x, y, player);
			return true;
		} else
			return false;
	}

	Boolean check_win() {
		// checks whether any row, column or diagonal is filled by a single player
		// if one does exist passes true else passes false.

		Boolean win = false;

		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != 0)
				win = true;
			else if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != 0)
				win = true;
		}
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != 0)
			win = true;
		else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != 0)
			win = true;
		return win;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (this.board[i][j] == 0)
					str += " -";
				else if (this.board[i][j] == 1)
					str += " O";
				else if (this.board[i][j] == 2)
					str += " X";
			}
			str += "\n";
		}
		return str;
	}
}
