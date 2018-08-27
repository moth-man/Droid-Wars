import java.util.List;

public class Droid {

	private String teamName;
	private double health;
	private double damage;
	private int range;
	private Position position;
	private List<DroidMove> moves;
	
	public Droid(String teamName) {
		this.teamName = teamName;
		health = Math.random();
		damage = Math.random();
		range = 3;
		
	}
	
	//Getters & Setters
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String name) {
		this.teamName = name;
	}
	public double getHealth() {
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
	public double getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;	
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public List<DroidMove> getMoves() {
		return moves;
	}

	public void setMoves(List<DroidMove> moves) {
		this.moves = moves;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	
	/* Take Damage : Droid takes damage from shot, subtracting damage
	 * of firing-droid from health of shot-droid.
	 */
	public void takeDamage(double damage){
		this.health -= damage;
	}
	


	/* Move : Takes a droid's move and moves to the cell if the cell is 
	 * empty and therefore moveable, or fires at enemy in cell of move,
	 * thus shootable.
	 */
	public void move(DroidMove droidMove){
		if(droidMove.getMoveType().equals(DroidMove.MOVEABLE))
			this.setPosition(droidMove.getDroidCell().getPosition());
		
		if(droidMove.getMoveType().equals(DroidMove.SHOOTABLE))
			droidMove.getDroidCell().getDroid().takeDamage(this.damage);
	}
	
	public boolean inRange(DroidCell droidCell, int range){
		double euclidX = Math.pow(droidCell.getPosition().getX()-this.getPosition().getX(),2);
		double euclidY = Math.pow(droidCell.getPosition().getY()-this.getPosition().getY(), 2);
		double euclidDist = Math.sqrt(euclidX + euclidY);
		
		return euclidDist < range;
		
	}
	
	/* Analyze Cell : Checks if cell has player or not and moves to 
	 * either the 'Moveable' or 'Shootable' list of DroidMoves titled 
	 * 'moves'.
	 */
	public void analyzeCell(DroidCell droidCell){
		if(droidCell.isEmpty() && this.inRange(droidCell, 2))
			this.moves.add(new DroidMove(droidCell, DroidMove.MOVEABLE));
		
		if(!droidCell.getDroid().getTeamName().equals(this.teamName) && this.inRange(droidCell, this.range))
			this.moves.add(new DroidMove(droidCell, DroidMove.SHOOTABLE));
	}
	
	public void stats(){
		System.out.println("(Team: " + this.teamName + ", Health: " + this.health + ", Damage: "
				+ this.damage + ", Position: " + this.position + ")");
	}
	
}
