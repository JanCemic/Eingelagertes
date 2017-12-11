package v1_ChatServer_ServerThread;
import java.io.*;
import java.net.*;
	
public class ServerThread {
	
	public static void main(String ags[]) throws IOException{
		BufferedReader br;
		PrintWriter out;
		BufferedReader br1;
		PrintWriter out1;
		try {
				//Sockets
			ServerSocket svrSkt = new ServerSocket(27015);
			Socket socket = null ;
			Socket sok1 = null;
			
					// verbinden
					System.out.println("Verbinde...");
				socket = svrSkt.accept();
					System.out.println("Client 1 verbunden");
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());
					//lesen
				br = new BufferedReader(isr);
				out = new PrintWriter(socket.getOutputStream(), true);			
					//verbinde 2
				sok1 = svrSkt.accept();
					System.out.println("Client 2 verbunden");
				InputStreamReader isr1 = new InputStreamReader(sok1.getInputStream());
					//lesen
				br1 = new BufferedReader(isr1);
				
				out1 = new PrintWriter(sok1.getOutputStream());
			while(true) {		
				//ausgeben
				out.println(br1);
					//System.out.println("Client1 sagt: " + br);
				out1.println(br);
					//System.out.println("Clinet2 sagt: "+ br1);
			}
		}
		catch(IOException e) {
			System.out.println("Fehler!");
		}
	}
}
