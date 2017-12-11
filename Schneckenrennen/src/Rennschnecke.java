
public class Rennschnecke {
	private String name;
	private String rasse;
	private int vMax;
	private int strecke;
	
	public Rennschnecke(String name, String rasse, int vMax) {
		strecke = 0;
		this.vMax = vMax;
		this.name = name;
		this.rasse = rasse;
	}
	
	public void krieche() {
		int distanz = (int) (Math.random()*vMax)+1;
		strecke = strecke + distanz;
	}
	
	public String toString() {
		return getName()+"("+getRasse()+") -> vMax:"+getvMax()+", Strecke:"+getStrecke();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	public int getvMax() {
		return vMax;
	}

	public void setvMax(int vMax) {
		this.vMax = vMax;
	}

	public int getStrecke() {
		return strecke;
	}

	public void setStrecke(int strecke) {
		this.strecke = strecke;
	}
	
	
}
