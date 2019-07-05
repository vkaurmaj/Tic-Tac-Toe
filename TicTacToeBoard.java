public class TicTacToeBoard

{
	private char [][] board = new char[3][3];
	private int turn = 0;

	// Board constructor
	public TicTacToeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	// Returns whose turn it is
	public int getTurn() {
		return turn;
	}
	
	// Changes turns
	public void turnChanger() {
		if (turn == 0) {
			turn = 1;
		}
		
		else {
			turn = 0;
		}
	}
	
	// Updates board according to click
	public void updateBoard(int x, int y, char m) {
		board[x][y] = m;
	}
	
	// Checks if game over conditions are met
	public int gameChecker() {
		
		// Checks rows
		if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' || board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
			return 1;
		}
		
		else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' || board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
			return 1;
		}
		
		else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' || board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
			return 1;
		}
		
		// Checks columns
		else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' || board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
			return 1;
		}
		
		else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' || board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
			return 1;
		}
		
		else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' || board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
			return 1;
		}
		
		// Checks diagonals
		else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' || board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			return 1;
		}
		
		else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' || board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			return 1;
		}
		
		else {
			// Checks if the game the game board is full and no other moves can be made
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == ' ') {
						return 0;
					}
				}
			}
			
			return -1;
		}
				
	}
	
};
