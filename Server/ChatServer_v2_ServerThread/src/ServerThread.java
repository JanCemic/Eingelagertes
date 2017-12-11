//Jan Cemic
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {
	
//			Server einrichten
	public static void main(String ags[]) throws IOException {

		String nachricht = null;
		BufferedReader br = null;
		PrintWriter out = null;
		ServerSocket server = null;
		ArrayList<Socket> sockets = new ArrayList<Socket>();
		ArrayList<InputStreamReader> isrs = new ArrayList<InputStreamReader>();
		InputStreamReader isr;

//			Server starten und auf ersten Clienten warten
		server = new ServerSocket(27015);
			System.out.println("Starte...");
		sockets.add(server.accept());
		isr = new InputStreamReader(sockets.get(0).getInputStream());
		br = new BufferedReader(isr);
		out = new PrintWriter(sockets.get(0).getOutputStream(), true);
		
//			Threads starten
		Empfangen empfangen = new Empfangen(br, sockets, isrs, out);
		Verbinden verbinden = new Verbinden(sockets, server, nachricht, empfangen);
		verbinden.start();
		empfangen.start();
			System.out.println("Server gestartet");
	}
}

// 				Threads
//			Empfangne/Senden
class Empfangen extends Thread {
	BufferedReader br;
	PrintWriter out;
	ArrayList<Socket> sockets = new ArrayList<Socket>();
	String nachricht;
	ArrayList<InputStreamReader> isrs = new ArrayList<InputStreamReader>();
	
	public void run() {	
		System.out.println("Server kann empfangen");
		do {
			for (int i = 0; i > sockets.size(); i++) {
				br = new BufferedReader(isrs.get(i));
				try {
					nachricht = br.readLine();
					out = new PrintWriter(sockets.get(i).getOutputStream(), true);
					out.println(sockets.get(i)+ ": " + nachricht);
						System.out.println(nachricht);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} while (true);
	}
	
	public String ausgeben() {
		return nachricht;
	}

	public Empfangen(BufferedReader br, ArrayList<Socket> sockets, ArrayList<InputStreamReader> isrs, PrintWriter out) {
		this.br = br;
		this.sockets = sockets;
		this.isrs = isrs;
		this.out = out;
	}
}


//			Verbinden
class Verbinden extends Thread{
	
	ArrayList<Socket> sockets = null;
	ServerSocket server = null;
	String nachricht = null;
	Empfangen empfangen = null;
 	
	public void run() {
		do {
			try {
				System.out.println("Kann mit Clienten verbinden...");
				for (int i = 0; i < sockets.size(); i++) {
					sockets.add(server.accept());
				}
				System.out.println("Verbunden");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (true);
	}
	
	public Verbinden(ArrayList<Socket> sockets, ServerSocket server, String nachricht, Empfangen empfangen) {
		this.sockets = sockets;
		this.server = server;
		this.nachricht = nachricht;
		this.empfangen = empfangen;
	}
}

