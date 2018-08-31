import java.util.ArrayList;
import java.util.List;

public class DroidGame {
	private DroidCell[] board;
	private List<DroidTeam> droidTeams;
	private DroidTeam activeTeam;
	private int height;
	private int width;
	private String[] teamNames;
	
	/* Droid Game : Creates game board using a one-dimensional array. 
	 * Takes in dimensions and array of team names.
	 */
	public DroidGame(int height, int width, String[] teamNames) {
		this.setHeight(height);
		this.width = width;
		this.board = new DroidCell[height*width];
		this.teamNames = teamNames;
		this.droidTeams = new ArrayList<DroidTeam>();
		
		// Adds team names to droidTeams list
		for(int w = 0; w < teamNames.length; w++){
			if(teamNames != null)
					droidTeams.add(new DroidTeam(teamNames[w]));
		}
		
		// Picks a random team from droidTeams and assigns a Droid or null space to cell
		for(int c = 0; c < this.getBoard().length; c++){
			DroidTeam randomTeam = droidTeams.get((int)Math.random()*teamNames.length);
			Droid droidOrNull = Math.random() < 0.15 ? new Droid(randomTeam.getName()) : null;
			
			// Adds droid to DroidsList on specified random team
			if(droidOrNull != null)
				randomTeam.getDroidsList().add(droidOrNull);
			
			// Assigns DroidCell with droidOrNull and a position with x & y
			board[c] = new DroidCell(droidOrNull, new Position(c/height,c%width));
		}
		
	}
	
	// Setters & Getters
	public DroidCell[] getBoard() {
		return board;
	}

	public DroidCell getCell(int x, int y){
		return board[width*x+y];
	}
	// OVERLOAD
	public DroidCell getCell(int cellIndex){
		return board[cellIndex/width];
	}

	public DroidTeam getActiveTeam() {
		return activeTeam;
	}

	public void setActiveTeam(DroidTeam activeTeam) {
		this.activeTeam = activeTeam;
	}

	/* Print Board : Method prints board for each turn (Simulate method)
	 * 
	 */
	public void printBoard(int height, int width){
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
					if(i == 0){
						System.out.print(j);
					} else if(j == 0){
						System.out.print(i);
					} else if(droidNotInBoardCell(i+1, j+1) == true){
						System.out.print("-");
					} else if(droidNotInBoardCell(i+1, j+1) == false){
						System.out.print("X");
					// e for error
					} else {
						System.out.print("e");
					}
					System.out.print(" ");
				}
				System.out.println();
		}

	}
	
	public boolean droidNotInBoardCell(int x, int y){
		for(DroidCell cell : this.getBoard()){
			if(cell.getPosition().getX() == x && cell.getPosition().getY() == y && cell.isEmpty())
				return true;
			else if(cell.getPosition().getX() == x && cell.getPosition().getY() == y && !cell.isEmpty())
				return false;
		}
		return true;
	}
	

	//Height & Width getters & setters
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}