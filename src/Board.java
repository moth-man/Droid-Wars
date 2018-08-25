
public class Board {

	private Droid[][] board;

	public Board(int length, int width) {
		this.board = new Droid[length][width];
	}

	public Droid[][] getBoard() {
		return board;
	}

	public boolean isValidPosition(Position position) {
		return position.getX() < this.board.length && position.getX() >= 0 && position.getY() < this.board[0].length
				&& position.getY() >= 0;

	}
}