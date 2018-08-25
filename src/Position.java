
public class Position {
	
	private int x;
	private int y;
	
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
	
	//Universal constructor for position
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public static Position N  = new Position(0, 1);
	public static Position E  = new Position(1, 0);
	public static Position W  = new Position(-1, 0);
	public static Position S  = new Position(0, -1);
	public static Position NE = new Position(1, 1);
	public static Position NW = new Position(-1, 1);
	public static Position SE = new Position(1, -1);
	public static Position SW = new Position(-1, -1);

}
