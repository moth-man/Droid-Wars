
public class DroidGameSimulator {

	// Simulate : Goes through every cell to check if there is droid and analyzes its moves
	public static void simulate(DroidGame game, DroidTeam team){
		for(DroidCell cell : game.getBoard().getCells())
			for(Droid droid : team.getDroidsList())	
				droid.analyzeCell(cell);
				
	}
}
