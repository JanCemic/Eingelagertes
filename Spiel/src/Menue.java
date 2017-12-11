import java.util.ArrayList;
import java.util.Scanner;

public class Menue {

	public Menue() {
	}

	public int menueAusgeben(ArrayList<Held> alleHelden,
			ArrayList<Monster> alleMonster) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. Monster hinzufügen\n" + "2. Helden wählen\n");
		switch (s.nextInt()) {
		case (1):

			System.out.println("Gegen welches Monster willst du kämpfen?\n");
			for (int i = 0; i > alleMonster.size(); i++) {
				System.out.println(i + 1 + alleMonster.get(i).getName());
				s.close();
				return i;

			}

			break;
		
		case (2):

			System.out.println("Welchen Helden willst du spielen?\n");
			for (int i = 0; i < alleHelden.size(); i++) {
				System.out.println(i + 1 + alleHelden.get(i).getName());
				s.close();
				return i;
			}
			break;
		
		default:
			break;
		}
		s.close();
		return 0;
	}
}