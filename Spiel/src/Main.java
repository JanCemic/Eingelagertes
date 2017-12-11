import java.util.ArrayList;

public class Main {
	
	public static void main(String ags[]){
		
		ArrayList <Held> alleHelden = new ArrayList <Held>();
		ArrayList <Monster> alleMonster = new ArrayList <Monster>();
		
		Kampf k1 = new Kampf(alleHelden, alleMonster);
			
			//Held erschaffen
		Held gandalf = new Held("Gandalf", 100, 50, 12, 80);
		Held ivan = new Held("Ivan", 0, 10 ,3, 65);
		
			//Monster erschaffen
		Monster schlammkrabbe = new Monster("Schlammkrabbe", 10, 1, 70);
		Monster skelett = new Monster("Skelett",15, 13, 90);
		
			//Held hinzufügen
		alleHelden.add(gandalf);
		alleHelden.add(ivan);
		
			//Monster hinzufügen
		alleMonster.add(schlammkrabbe);
		alleMonster.add(skelett);
		
			//Menue erstellen
		Menue menue = new Menue();
		menue.menueAusgeben(alleHelden, alleMonster);
	}
}