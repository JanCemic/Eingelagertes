import java.util.ArrayList;

public class reatsel {
//30
//1,3,5,7,9,11,13,15
	public static void main(String ags[]) {
	int x = 0;
	int y = 0;
	int z = 0;
	int pruefung =0;
	
	ArrayList<Integer> zahlen = new ArrayList();
	zahlen.add(1);
	zahlen.add(3);
	zahlen.add(5);
	zahlen.add(7);
	zahlen.add(9);
	zahlen.add(11);
	zahlen.add(13);
	zahlen.add(15);

	
	while(pruefung != 30) {
		for(int i = 0;i < zahlen.size(); i++) {
		x = zahlen.get(i);
		pruefung = x + y + z;
			for(int o = 0;o < zahlen.size(); o++) {
				y = zahlen.get(o);
				pruefung = x + y + z;
				for(int p = 0;p < zahlen.size(); p++) {
					z = zahlen.get(p);
					pruefung = x + y + z;
						//Ausweg
					if(x == 15 && y == 15 && z == 15) {
						pruefung = 30;
						System.out.println("Geht nicht!");
						}
					}
				}
			}
		}

		System.out.print(x+ " " + y+ " " + z+ " ");
	}
}