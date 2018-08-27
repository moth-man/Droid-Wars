
public class DroidGameRunner {

	public static void main(String args[]) {

		DroidGame theGame = new DroidGame(25, 25, 10, new String[] { "Gr", "Ye", "Pu" });
		System.out.println(theGame.getBoard());

	}
}
