
public class DroidBoard {
	private DroidCell[] cells;
	private int height;
	private int width;

	public DroidBoard(int height, int width) {
		this.height = height;
		this.width = width;
		this.cells = new DroidCell[height * width];

		// Picks a random team from droidTeams and assigns a Droid or null space to cell
		for (int c = 0; c < cells.length; c++)
			cells[c] = new DroidCell(null, new Position(c / height, c % width));
	}

	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("    ");

		for (int i = 0; i < this.width; i++)
			stringBuilder.append(String.format("[%02d]", i));

		for (DroidCell cell : this.cells) {
			if (cell.getPosition().getY() == 0)
				stringBuilder.append("\n" + String.format("[%02d]", cell.getPosition().getX()));

			stringBuilder.append("[" + (cell.isEmpty() ? "  " : cell.getDroid().getTeamName()) + "]");
		}

		return stringBuilder.toString();
	}

	public DroidCell getCell(int x, int y) {
		return cells[width * x + y];
	}

	public DroidCell[] getCells() {
		return cells;
	}

	public DroidCell getRandomCell() {
		return this.cells[(int) (Math.random() * this.cells.length)];
	}

	public int getHeight() {
		return height;
	}

}
