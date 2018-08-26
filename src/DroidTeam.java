import java.util.ArrayList;
import java.util.List;

public class DroidTeam {

	private String name;
	private List<Droid> droidsList;
	private List<DroidMove> movesList;
	
	public List<DroidMove> getMovesList() {
		movesList = new ArrayList<DroidMove>();
		for(Droid droid : droidsList)
			movesList.addAll(droid.getMoves());
		return movesList;
	}

	public void setMovesList(List<DroidMove> movesList) {
		this.movesList = movesList;
	}
	
	public List<Droid> getDroidsList() {
		return droidsList;
	}

	public void setDroidsList(List<Droid> droidsList) {
		this.droidsList = droidsList;
	}

	public DroidTeam(String name){
		this.setName(name);
		this.droidsList = new ArrayList<Droid>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
