
public class DroidGameRunner {

	public static void main(String args[]) {
		int height = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		String[] teams = {"Green", "Yellow", "Purple"};
		DroidGame theGame = new DroidGame(height, width, teams);
		
		
	}
}
