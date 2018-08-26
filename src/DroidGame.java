public class DroidGame {
	private DroidCell[] board;
	private int height;
	private int width;
	
	
	public DroidGame(int height, int width) {
		this.height = height;
		this.width = width;
		this.board = new DroidCell[height*width];
		
		for(int c = 0; c < this.getBoard().length; c++){
			Droid droidOrNull = Math.random() < 0.15? new Droid("Green"):null;
			board[c] = new DroidCell(droidOrNull, new Position(c/height,c%width));
		}
		
	}
	
	public DroidCell[] getBoard() {
		return board;
	}

	public DroidCell getCell(int x, int y){
		return board[width*x+y];
	}
	
	public DroidCell getCell(int cellIndex){
		return board[cellIndex/width];
	}

}