import java.util.ArrayList;
import java.util.List;

public class DroidGame {
	private DroidBoard board;
	private List<DroidTeam> droidTeams;
	private DroidTeam activeTeam;
	private int height;
	private int width;

	// Droid Game : Creates game board using a one-dimensional array. Takes in array
	// of team names
	public DroidGame(int height, int width, double population, String[] teamNames) {
		this.height = height;
		this.width = width;
		this.board = new DroidBoard(height, width);
		this.droidTeams = new ArrayList<DroidTeam>();

		// Adds team names to droidTeams list
		for (int w = 0; w < teamNames.length; w++)
			droidTeams.add(new DroidTeam(teamNames[w]));

		for (int d = 0; d < population; d++) {
			int randomTeamIndex = (int) (Math.random() * this.droidTeams.size());
			DroidTeam randomTeam = droidTeams.get(randomTeamIndex);
			DroidCell cell = this.board.getRandomCell();
			Droid droid = new Droid(randomTeam.getName(), cell.getPosition());
			cell.setDroid(droid);
			
			randomTeam.getDroidsList().add(droid);
		}

	}

	public DroidBoard getBoard() {
		return board;
	}

	public DroidTeam getActiveTeam() {
		return activeTeam;
	}

	public void setActiveTeam(DroidTeam activeTeam) {
		this.activeTeam = activeTeam;
	}

	public List<DroidTeam> getDroidTeams() {
		return droidTeams;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}