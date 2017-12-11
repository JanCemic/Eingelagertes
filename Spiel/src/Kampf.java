import java.util.ArrayList;

public class Kampf{
	
	private ArrayList <Held> alleHelden = new ArrayList <Held>();
	private ArrayList <Monster> alleMonster = new ArrayList <Monster>();
	
	public ArrayList<Held> getAlleHelden() {
		return alleHelden;
	}
	public void setAlleHelden(ArrayList<Held> alleHelden) {
		this.alleHelden = alleHelden;
	}

	public ArrayList<Monster> getAlleMonster() {
		return alleMonster;
	}
	public void setAlleMonster(ArrayList<Monster> alleMonster) {
		this.alleMonster = alleMonster;
	}
		
		//Konstruktor
	public Kampf(ArrayList <Held> alleHelden, ArrayList <Monster> alleMonster){
		this.alleHelden = new ArrayList <Held>();
		this.alleMonster = new ArrayList <Monster>();
	}
		
		//Trifft der Held/ das Monster?
	public boolean treffer(int x, int y){
		
		boolean trfHeld;
		boolean trfMonster;
		
		if(alleHelden.get(x).getTrefferwars() * zufallsZahl(2) > 100){
			trfHeld = true;
			}
			else{
				trfHeld = false;
				}
		if(alleMonster.get(y).getTrefferWars() * zufallsZahl(2) > 100){
			trfMonster = true;
			}
			else{
				trfMonster = false;
				}
		return trfHeld;
		}
	
		//Held zieht Monster einmahl Hp ab Monster zieht Held einmahl Hp ab	
	public void attack(int x ,int y){
			if(alleMonster.get(y).getHp() > 0){
				if(treffer(x ,y)== true){
					
			alleMonster.get(y).setHp(alleMonster.get(y).getHp() - alleHelden.get(x).getAp());
				System.out.println(alleHelden.get(x).getName() + " trifft " +
					alleMonster.get(y).getName());
				}
			}
			
			if(alleMonster.get(y).getHp() > 0){
				if(treffer(x, y) == true){
					
			alleHelden.get(x).setHp(alleHelden.get(x).getHp() - alleMonster.get(y).getAp());
				System.out.println(alleMonster.get(y).getName() + " trifft " +
					alleHelden.get(x).getName());
				
				}
		}
	}
		
		//Einen Helden hinzufügen	
	public void addHeld(Held held){
		alleHelden.add(held);
	}

		//Ein Monster hinzufügen
	public void addMonster(Monster monster){

		alleMonster.add(monster);
	}
	
		//Solange attac ausführen bis Monster oder Held keine Hp hat
	public void fight(int x, int y){
		while(alleHelden.get(x).alive() && alleMonster.get(y).alive()){
		attack(x,y);
		}
		if (alleHelden.get(x).alive()){
				System.out.println("Der Held hat gewonnen\n" +
						"Restliche Hp: " + alleHelden.get(x).getHp());
			}else{
				System.out.println("Das Monster hat gewonnen.\n" +
						"Restliche Hp: " + alleMonster.get(y).getHp());
			}
		}
	
	public double zufallsZahl (int x){ 
	    double y = (double)(Math.random() * x) + 1; 
		return y;
	}
}

		//Zufallszahl
	
	