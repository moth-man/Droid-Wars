
public class Vector {

	private Position endPosition;

	// Constructor
	public Vector(Position endPosition) {
		this.setEndPosition(endPosition);
	}

	public Position getEndPosition() {
		return endPosition;
	}
	public void setEndPosition(Position endPosition) {
		this.endPosition = endPosition;
	}

	public static Vector N = new Vector(new Position(0, 1));
	public static Vector E = new Vector(new Position(1, 0));
	public static Vector W = new Vector(new Position(-1, 0));
	public static Vector S = new Vector(new Position(0, -1));
	public static Vector NE = new Vector(new Position(1, 1));
	public static Vector NW = new Vector(new Position(-1, 1));
	public static Vector SE = new Vector(new Position(1, -1));
	public static Vector SW = new Vector(new Position(-1, -1));

}
