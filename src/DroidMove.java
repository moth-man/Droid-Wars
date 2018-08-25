
public class DroidMove {

	public static final String MOVEABLE = "Moveable";
	public static final String SHOOTABLE = "Shootable";
	
	private DroidCell droidCell;
	private String moveType;
	
	public DroidMove(DroidCell droidCell, String moveType){
		this.droidCell = droidCell;
		this.moveType = moveType;
		
	}

	public DroidCell getDroidCell() {
		return droidCell;
	}

	public void setDroidCell(DroidCell droidCell) {
		this.droidCell = droidCell;
	}

	public String getMoveType() {
		return moveType;
	}

	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}
	
}
