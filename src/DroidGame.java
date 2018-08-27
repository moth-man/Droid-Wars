import java.util.ArrayList;
import java.util.List;

public class DroidGame {
	private DroidCell[] board;
	private List<DroidTeam> droidTeams;
	private DroidTeam activeTeam;
	private int height;
	private int width;

	// Droid Game : Creates game board using a one-dimensional array. Takes in array
	// of team names
	public DroidGame(int height, int width, String[] teamNames) {
		this.height = height;
		this.width = width;
		this.board = new DroidCell[height * width]; 
		this.droidTeams = new ArrayList<DroidTeam>();

		// Adds team names to droidTeams list
		for (int w = 0; w < teamNames.length; w++) 
			droidTeams.add(new DroidTeam(teamNames[w]));


		// Picks a random team from droidTeams and assigns a Droid or null space to cell
		for (int c = 0; c < this.getBoard().length; c++) {
			Position currentPosition = new Position(c / height, c % width);
			Integer randomTeamIndex = (int) (Math.random() * teamNames.length);
			DroidTeam randomTeam = droidTeams.get(randomTeamIndex);
			Droid droidOrNull = Math.random() < 0.15 ? new Droid(randomTeam.getName(), currentPosition) : null;

			// Adds droid to DroidsList on specified random team
			if (droidOrNull != null)
				randomTeam.getDroidsList().add(droidOrNull);

			// Assigns DroidCell with droidOrNull and a position with x & y
			board[c] = new DroidCell(droidOrNull, currentPosition);
		}

	}

	public DroidCell[] getBoard() {
		return board;
	}

	public DroidCell getCell(int x, int y) {
		return board[width * x + y];
	}

	// OVERLOAD
	public DroidCell getCell(int cellIndex) {
		return board[cellIndex / width];
	}

	public DroidTeam getActiveTeam() {
		return activeTeam;
	}

	public void setActiveTeam(DroidTeam activeTeam) {
		this.activeTeam = activeTeam;
	}

	/*
	 * @Override public boolean isOver() { // TODO Auto-generated method stub return
	 * false; }
	 */

}