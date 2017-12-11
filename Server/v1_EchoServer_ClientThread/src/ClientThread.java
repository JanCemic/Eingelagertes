import java.net.*;
import java.io.*;

public class ClientThread {

	public static void main(String ags[]) throws IOException {
		
			//Zum lesen und schreiben mit dem Server
		BufferedReader br;
		PrintWriter out;
			
			//try = Versuche das zu machen, wenn das micht klappt dann geh zu catch()
		try {
				//neuen Socket erstellen mit ("Adresse", Port)
			Socket socket = new Socket("localhost", 27015);
			
				//InputStreamReader wird der InputSteam vom Socket zugeteilt 
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
				//PrintWriter wird der OutputStream vom Socket zugeteilt
			out = new PrintWriter(socket.getOutputStream(), true);
				//über den Socket wird eine Nachricht abgegeben
							System.out.println("Sende Packete... ");
//							!!!SENDET NICHT!!!
			out.print("Hallo vom Clienten");
				//InputStreamReader liest den Input Stream und gibt diesen aus
			String s = br.readLine();
							System.out.println("Paket gesendet");
				System.out.println("Antwort vom Server: " + s);
				
				//siehe try
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
}
