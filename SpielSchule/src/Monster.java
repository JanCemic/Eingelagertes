
public class Monster {

	private int angriffspunkt;
	private int lebenspunkt;
	public int getAngriffspunkt() {
		return angriffspunkt;
	}
	public void setAngriffspunkt(int angriffspunkt) {
		this.angriffspunkt = angriffspunkt;
	}
	public int getLebenspunkt() {
		return lebenspunkt;
	}
	public void setLebenspunkt(int lebenspunkt) {
		this.lebenspunkt = lebenspunkt;
	}
	
	public Monster(int angriffspunkt, int lebenspunkt) {
		setAngriffspunkt(angriffspunkt);
		setLebenspunkt(lebenspunkt);
	}
	
}
