
public class Wuerfel {
	private int anzahlSeiten;
	
	public int getAnzahlSeiten() {
		return anzahlSeiten;
	}
	public void setAnzahlSeiten(int anzahlSeiten) {
		this.anzahlSeiten = anzahlSeiten;
	}
	public Wuerfel(int anzahlSeiten) {
		this.anzahlSeiten = anzahlSeiten;
	}

	
	public int wuerfeln() {
		double test = Math.random() * anzahlSeiten;
		return (int)test;
	}	
}
