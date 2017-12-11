
public abstract class Held {
	
		//Attribute
	private String name;
	private int staerke;
	protected int angriffspunkt;
	protected int lebenspunkt;
	protected Waffe waffe;
	private String klasse;
	
		//Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStaerke() {
		return staerke;
	}
	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}
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
	public Waffe getWaffe(){
		return waffe;
	}
	public String getKlasse() {
		return klasse;
	}
	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
		
		//Konstruktor
 	public Held(String name, int staerke, int angriffspunkt, int lebenspunkt, Waffe waffe, String klasse){
		this.name = name;
		this.staerke = staerke;
		this.angriffspunkt = angriffspunkt;
		this.lebenspunkt = lebenspunkt;
		this.waffe = waffe;
		this.klasse = klasse;
	}
	
	public void angriff(Monster g, Kampfregel r) {
		if(getAngriffspunkt() > g.getAngriffspunkt());
	}
	
	public void bonusBerechnen(Krieger k1){
		this.angriffspunkt += this.waffe.getBonus(); 
	}
}
