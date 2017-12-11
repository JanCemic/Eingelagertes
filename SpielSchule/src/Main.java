
public class Main {

	public static void main(String ags[]) {
		
		Waffe waf1 = new Waffe("Stahl", 1);
		
		waf1.bonusBerechnen();
		
		Krieger k1 = new Krieger("Taromir", 11, 17, 2, waf1, "Krieger");
		
			//System.out.println(k1.getWaffe().getBonus());
		
		Monster m1 = new Monster(12 ,2);
		
		Wuerfel w1 = new Wuerfel(6);
		Wuerfel w2 = new Wuerfel(10);
		
		int rundenGespielt = 0;
		
		while(m1.getLebenspunkt() > 0 && k1.getLebenspunkt() > 0) {
			int wuerfelMonster = w1.wuerfeln() + w2.wuerfeln();
			int wuerfelHeld = w1.wuerfeln() + w2.wuerfeln();
		
			Kampfregel kam1 = new Kampfregel(wuerfelHeld ,wuerfelMonster);
		
			kam1.kampf(k1, m1);
			rundenGespielt++;
		}
			System.out.println("Der Kampf hat " + rundenGespielt + 
					" Runden gedauert.");
	}
}
