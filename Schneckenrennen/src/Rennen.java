import java.util.ArrayList;
/**
 * 
 * @author arohde
 * Implemntiert die Klasse Rennen der Java Freitagsrunde
 */
public class Rennen {
	private String name;
	private ArrayList<Rennschnecke> schnecken;
	private int streckenLaenge;
	
	/**
	 * Kontruktor
	 * @param name : Name des Rennens
	 * @param streckenLaenge : Streckenlänge des Rennens
	 */
	public Rennen(String name, int streckenLaenge) {
		this.name = name;
		this.streckenLaenge = streckenLaenge;
		this.schnecken = new ArrayList<Rennschnecke>();
	}
	
	/**
	 * 
	 * @param neueSchnecke: Schnecke, die hinzugefügt werden soll
	 */
	public void addRennschnecke(Rennschnecke neueSchnecke) {
		schnecken.add(neueSchnecke);
	}
	
	/**
	 * 
	 * @param name: 
	 */
	public void removeRennschnecke(String name) {
		Rennschnecke tempRs = null;
		for (Rennschnecke rs : schnecken) {
			if (rs.getName() == name) {
				tempRs = rs;
			}
		}
		if (tempRs != null) {
			schnecken.remove(tempRs);
		}
	}
	
	public String toString() {
		String s = "Rennen: "+getName()+", Länge:"+getStreckenLaenge()+", Anz. Schnecken:"+schnecken.size()+"\n";
		for (Rennschnecke rs : schnecken) {
			s += rs + "\n";
		}
		return s;
	}
	
	public Rennschnecke ermittleGewinner() {
		Rennschnecke rs = null;
		for (Rennschnecke temp : schnecken) {
			if (temp.getStrecke() >= getStreckenLaenge()) {
				if (rs == null) {
					rs = temp;
				} else {
					if (temp.getStrecke() > rs.getStrecke()) {
						rs = temp;
					}
				}
			}
		}
		return rs;
	}
	
	public void lasseSchneckenKriechen() {
		for (Rennschnecke rs : schnecken) {
			rs.krieche();
		}
	}
	
	public void durchfuehren() {
		Rennschnecke gewinner = null;
		while (gewinner == null) {
			lasseSchneckenKriechen();
			
			// Damit man überhaupt mal eine Ausgabe hat
			System.out.println(this);
			
			gewinner = ermittleGewinner();
		}
	}
	
	public Rennschnecke getGewinner() {
		return ermittleGewinner();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Rennschnecke> getSchnecken() {
		return schnecken;
	}

	public void setSchnecken(ArrayList<Rennschnecke> schnecken) {
		this.schnecken = schnecken;
	}

	public int getStreckenLaenge() {
		return streckenLaenge;
	}

	public void setStreckenLaenge(int streckenLaenge) {
		this.streckenLaenge = streckenLaenge;
	}
	
}
