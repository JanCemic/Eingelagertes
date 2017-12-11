
public class Main {

	public static void main(String[] args) {
		Rennen r = new Rennen("WvSS", 100);
		Rennschnecke rs = new Rennschnecke("Ruben", "Student snake", 10);
		r.addRennschnecke(rs);
		rs = new Rennschnecke("Niko", "Greek snake", 9);
		r.addRennschnecke(rs);
		rs = new Rennschnecke("Rafail", "Greek snake", 8);
		r.addRennschnecke(rs);
		rs = new Rennschnecke("Jan", "Smart snake", 10);
		r.addRennschnecke(rs);
		rs = new Rennschnecke("Lukas", "Seeger snake", 9);
		r.addRennschnecke(rs);
		rs = new Rennschnecke("Alex", "Teacher snake", 8);
		r.addRennschnecke(rs);
		r.durchfuehren();
		System.out.println(r.getGewinner());
				
	}

}
