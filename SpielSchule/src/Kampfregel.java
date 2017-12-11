
public class Kampfregel {
	
	private int wuerfelHeld;
	private int wuerfelMonster;
	public int getWuerfelHeld() {
		return wuerfelHeld;
	}
	public void setWuerfelHeld(int wuerfelHeld) {
		this.wuerfelHeld = wuerfelHeld;
	}
	public int getWuerfelMonster() {
		return wuerfelMonster;
	}
	public void setWuerfelMonster(int wuerfelMonster) {
		this.wuerfelMonster = wuerfelMonster;
	}

	public Kampfregel(int wuerfelHeld, int wuerfelMonster){
		this.wuerfelHeld = wuerfelHeld;
		this.wuerfelMonster = wuerfelMonster;
	}
	
	public void kampf(Held h1, Monster m1){
		
		//if(m1.getLebenspunkt() > 0 && h1.getLebenspunkt() > 0){
			
		if(wuerfelHeld >= wuerfelMonster){
			m1.setLebenspunkt(m1.getLebenspunkt()-1);
			}
		
		if(wuerfelHeld < wuerfelMonster) {
			h1.setLebenspunkt(h1.getLebenspunkt()-1);
			}
		//}
		if(m1.getLebenspunkt() <= 0) {
			System.out.println("Held hat gewonne!");
		}
		if(h1.getLebenspunkt() <= 0) {
			System.out.println("Monster hat gewonne!");
		}
	}
}
