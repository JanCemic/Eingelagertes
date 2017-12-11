
public class Krieger extends Held {

	private int ausdauer;
	
	public int getAusdauer() {
		return ausdauer;
	}
	public void setAusdauer(int ausdauer) {
		this.ausdauer = ausdauer;
	}

	public Krieger(String name, int staerke, int angriffspunkt, int lebenspunkt, Waffe waffe, String klasse) {
		super(name, staerke, angriffspunkt, lebenspunkt, waffe, klasse);
	}
	
	@Override
	public void bonusBerechnen(Krieger k1){
		this.angriffspunkt += this.waffe.getBonus(); 
		this.angriffspunkt += this.ausdauer;
	}
}