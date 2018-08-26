import java.util.List;

public class DroidGame implements MiniMax{
	private DroidCell[] board;
	private List<DroidTeam> droidTeams;
	private DroidTeam activeTeam;
	private int height;
	private int width;
	
	
	public DroidGame(int height, int width, String[] teamNames) {
		this.height = height;
		this.width = width;
		this.board = new DroidCell[height*width];
		
		for(int w = 0; w < teamNames.length; w++)
			droidTeams.add(new DroidTeam(teamNames[w]));
		
		for(int c = 0; c < this.getBoard().length; c++){
			DroidTeam randomTeam = droidTeams.get((int)Math.random()*teamNames.length);
			Droid droidOrNull = Math.random() < 0.15? new Droid(randomTeam.getName()):null;
			
			if(droidOrNull != null)
				randomTeam.getDroidsList().add(droidOrNull);
			
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

	public DroidTeam getActiveTeam() {
		return activeTeam;
	}

	public void setActiveTeam(DroidTeam activeTeam) {
		this.activeTeam = activeTeam;
	}

	@Override
	public boolean isOver() {
		// TODO Auto-generated method stub
		return false;
	}

}