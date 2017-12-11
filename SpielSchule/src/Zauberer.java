
public class Zauberer extends Held {

	public int magie;
	
	public int getMagie() {
		return magie;
	}
	public void setMagie(int magie) {
		this.magie = magie;
	}

	public Zauberer(String name, int staerke, int angriffspunkt, int lebenspunkt, Waffe waffe, String klasse) {
		super(name, staerke, angriffspunkt, lebenspunkt, waffe, klasse);
	}
	
	public void heilen() {
		this.lebenspunkt += this.magie;
	}
}
