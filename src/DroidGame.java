
public class DroidGame {
	private DroidCell[] board;
	private int length;
	private int width;
	
	/*
	public DroidBoard(int length, int width) {
		this.board = new Droid[length][width];
	}

	public Droid[][] getBoard() {
		return board;
	}

	public boolean isValidPosition(Position position) {
		return position.getX() < this.board.length && position.getX() >= 0 && position.getY() < this.board[0].length
				&& position.getY() >= 0;

	}
	*/
	
	public DroidGame(int length, int width) {
		this.length = length;
		this.width = width;
		this.board = new DroidCell[length*width];
		
	}
	
	public DroidCell[] getBoard() {
		return board;
	}

	public DroidCell getCell(int x, int y){
		return board[width*x+y];
	}
}