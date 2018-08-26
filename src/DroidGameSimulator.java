
public class DroidGameSimulator {

	public static void simulate(DroidGame game, DroidTeam team){
		for(DroidCell cell : game.getBoard())
			for(Droid droid : team.getDroidsList())	
				droid.analyzeCell(cell);
				
	}
}
