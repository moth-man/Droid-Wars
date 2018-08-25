
public class Direction {
	
	private int x;
	private int y;
	//Constructor
	public Direction(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static Direction N = new Direction(0,1);
	public static Direction E = new Direction(1,0);
	public static Direction W = new Direction(-1,0);
	public static Direction S = new Direction(0,-1);
	public static Direction NE = new Direction(1,1);
	public static Direction NW = new Direction(-1,1);
	public static Direction SE = new Direction(1,-1);
	public static Direction SW = new Direction(-1,-1);
	
}
