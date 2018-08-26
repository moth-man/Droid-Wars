import java.util.ArrayList;
import java.util.List;

public class DroidTeam {

	private String name;
	private List<Droid> droidsList;
	
	public DroidTeam(String name){
		this.name = name;
		this.droidsList = new ArrayList<Droid>();
	}

	public List<Droid> getDroidsList() {
		return droidsList;
	}

	
}
