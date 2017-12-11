
public class Waffe {
	
	private int bonus;
	private String material; 
	private int magie;
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getMagie() {
		return magie;
	}
	public void setMagie(int magie) {
		this.magie = magie;
	}
		
			//Konstruktor
	
	public Waffe(String material, int magie) {
		this.material = material;
		this.magie = magie;
	}
	
	public int bonusBerechnen(){
		switch(material) {
		case("Stahl"):
			this.bonus = 10;
			break;
		case("Holz"):
			this.bonus = 1;
			break;
		case("Gold"):
			this.bonus = 11;
			break;
		default: 
			break;
		}
		return bonus;
	}
}