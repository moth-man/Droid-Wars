
public class DroidBoard {
	private Droid[][] board;
	
	public DroidBoard(int length, int width) {
		this.board = new Droid[length][width];
	}

	public Droid[][] getBoard() {
		return board;
	}

	public boolean isValidPosition(DroidPosition position) {
		return position.getX() < this.board.length && position.getX() >= 0 && position.getY() < this.board[0].length
				&& position.getY() >= 0;

	}
}