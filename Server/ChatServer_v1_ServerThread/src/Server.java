import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(27015);
				System.out.println("Warte auf Verbindung.");
			Socket socket = server.accept();
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
				System.out.println("Verbunden mit Client");
			
			String s;
			
			while(true) {
			s = br.readLine();
				System.out.print("Empfangen vom Client: " + s);
			out.print(s);
			out.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class sender{
	
}