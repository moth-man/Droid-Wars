
public class DroidGameRunner {

	public static void main(String args[]) {
		int height = 6;
		int width = 6;
		String[] teams = {"Green", "Yellow", "Purple"};
		DroidGame theGame = new DroidGame(height, width, teams);
		for(int i = 0; i < theGame.getBoard().length; i++){
			theGame.getCell(i).getDroid().stats();
		}
		
		
	}
}
