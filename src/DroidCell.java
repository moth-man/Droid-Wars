
public class DroidCell {

	private Droid droid;
	private Position position;
	
	public DroidCell(Droid droid, Position position){
		this.droid = droid;
		this.position = position;
	}
	
	public boolean isEmpty(){
		return droid == null;
	}

	public Droid getDroid() {
		return droid;
	}

	public void setDroid(Droid droid) {
		this.droid = droid;
	}

	public Position getPosition() {
		return position;
	}

	public void setDroidPosition(Position position) {
		this.position = position;
	}
}
