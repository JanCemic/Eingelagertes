
public class Monster {
	
	private String name;
	private int hp;
	private int ap;
	private int treffeWars;

	public void setName(String name){
	this.name = name;
	}
	public String getName(){
	return name;
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
		this.treffeWars = trefferWars;
	}
	public int getTrefferWars(){
		return treffeWars;
	}
	
	//String name, int hp, int ap, int TrefferWarscheinlichkeit
	public Monster(String name, int hp, int ap, int trefferWars){
	setName(name);
	setHp(hp);
	setAp(ap);
	setTrefferWars(trefferWars);
	}

public boolean alive(){
	if(getHp() > 0){
		return true;
	}else
		return false;
	}
}

