package organizer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
}
*/

public class Main {

		public static void main(String ags[]) {
			
			int menueZahl = 0;
			ArrayList<Event> events = new ArrayList<Event>();
			int ausweg = 0; 
			while(ausweg != 1) {
				System.out.print("Was willst du tun? \n 1: Eintrag hinzufuegen \n 2: Alle Eintraege anzeigen \n 3: Programm beenden");
				System.out.println("\n");
			Scanner s1 = new Scanner(System.in);
			menueZahl = s1.nextInt();
			//s1.close();
			
			switch(menueZahl) {
				case(1):
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					Date date = new Date();
					Scanner s = new Scanner(System.in);
						System.out.println("Gib Eventzeit ein: \n" + "(yyyy-MM-dd HH:mm:ss) ");
					String zeit = s.next();
						System.out.println("Gib den Name ein: ");
					String name = s.next();
					//s.close();
					try {
						date = formatter.parse(zeit);
	           
					} catch (ParseException e) {}
		
						events.add(new Event(date, name));
			break;
				case(2):
						System.out.println("Alle Ereignise: \n");
					for(int i = 0; i < events.size(); i++) {
						System.out.println(events.get(i));
					}
						System.out.println("\n \n \n");
			break;
				case(3):
					ausweg = 1;
			break;
			
			default:
				System.out.println("eine Zahl von 1-3, versuchs nochmal ;) ");
			break;
			}
		}
	}
}
