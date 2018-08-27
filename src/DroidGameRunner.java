
public class DroidGameRunner {

	public static void main(String args[]) {

		DroidGame theGame = new DroidGame(25, 25, new String[] { "G", "Y", "P" });

		for (DroidCell cell : theGame.getBoard()) {
			if (cell.getPosition().getY() == 0)
				System.out.println();

			System.out.print("[" + (cell.isEmpty() ? " " : cell.getDroid().getTeamName()) + "]");
		}
	}
}
