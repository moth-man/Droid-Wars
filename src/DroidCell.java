
public class DroidCell {

	private Droid droid;
	private DroidPosition droidPosition;
	
	public DroidCell(Droid droid, DroidPosition droidPosition){
		this.droid = droid;
		this.droidPosition = droidPosition;
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

	public DroidPosition getDroidPosition() {
		return droidPosition;
	}

	public void setDroidPosition(DroidPosition droidPosition) {
		this.droidPosition = droidPosition;
	}
}
