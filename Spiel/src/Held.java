
public class Held {

private String name;
private int level;
private int hp;
private int ap;
private int trefferWars;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getHp(){
		return hp;
	}
	
	public void setAp(int ap){
		this.ap = ap;
	}
	public int getAp(){
		return ap;
	}

	public void setTrefferWars(int trefferWars){
		this.trefferWars = trefferWars;
	}
	public int getTrefferwars(){
		return trefferWars;
	}
	
		//String name, int level, int hp, int ap, int trefferWarscheinlichkeit
	public Held(String name, int level, int hp, int ap, int trefferWars){
		setName(name);
		setLevel(level);
		setHp(hp);
		setAp(ap);
		setTrefferWars(trefferWars);
	}
	
	public boolean alive(){
		if(getHp() > 0){
			return true;
		}else{
			return false;
		}
	}
}
