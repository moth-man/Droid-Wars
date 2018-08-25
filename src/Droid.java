import java.util.List;

public class Droid {

	private String teamName;
	private int health;
	private int damage;
	private int range;
	private DroidPosition droidPosition;
	private List<DroidMove> moves;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String name) {
		this.teamName = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
		
	}
	public DroidPosition getPosition() {
		return droidPosition;
	}
	public void setPosition(DroidPosition droidPosition) {
		this.droidPosition = droidPosition;
	}
	
	
	public void takeDamage(int damage){
		this.health -= damage;
	}
	
	
	public void move(DroidMove droidMove){
		if(droidMove.getMoveType().equals(DroidMove.MOVEABLE))
			this.setPosition(droidMove.getDroidCell().getDroidPosition());
		
		if(droidMove.getMoveType().equals(DroidMove.SHOOTABLE))
			droidMove.getDroidCell().getDroid().takeDamage(this.damage);
	}
	
	
	public void analyzeCell(DroidCell droidCell){
		if(droidCell.isEmpty())
			this.moves.add(new DroidMove(droidCell, DroidMove.MOVEABLE));
		
		if(!droidCell.getDroid().getTeamName().equals(this.teamName))
			this.moves.add(new DroidMove(droidCell, DroidMove.SHOOTABLE));
	}
	
}
