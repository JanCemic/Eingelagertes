package v1_EchoServer_ServerThread;
import java.io.*;
import java.net.*;

public class ServerThread {

	public static void main(String ags[]) throws IOException {
			//zum lesen und Schreiben mit Clienten
		BufferedReader br;
		PrintWriter out;
			//wenn try fehlschlägt, dann versuche catch
		try {
				//ServerSocket erstellen mit (Port)
					//damit Server merkt wenn er angesprochen wird immer offen
			ServerSocket server = new ServerSocket(27015);
				System.out.println("Warte auf Verbindung...");
				//gucken ob es eine Verbindung gibt
			Socket socket = server.accept();
						System.out.println("Verbindung hergestellt");
				//Dem Socket den InputStream zuweisen
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
				//den InputStream vom Socket lesen
			br = new BufferedReader(isr);
						System.out.println("kann lesen");
				//dem Socket den OutputStream zuweisen
			out = new PrintWriter(socket.getOutputStream(), true);
						System.out.println("kann schreiben");
				//den InputStream ausgeben
			String s = br.readLine();
				System.out.println(s);
				//die Verbindung zum Clienten trennen
			socket.close();
		}	
			//sieh try
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
