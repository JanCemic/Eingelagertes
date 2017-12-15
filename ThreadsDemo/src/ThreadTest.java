
public class ThreadTest {
	
	public static void main(String ags[]) {
		for(int i = 0; i<4; i++) {
					Test1 t = new Test1();
		Thread thread = new Thread(t);
		thread.start();
		}
	}
}

class Test1 implements Runnable {
	public void run() {
		long anfang = System.currentTimeMillis();
		System.out.println("Thread gestartet!");
		long l = 0;
		for (int i = 0; i < 100; i++) {
			System.out.println("Berechne...");
			for (int k = 0; k < 50000000; k++) {
				l++;
			}
			System.out.println("Berechne " + i + "%");
		}
		System.out.println("fertig!");
		long ende = System.currentTimeMillis();
		System.out.println(ende-anfang);
	}
}
