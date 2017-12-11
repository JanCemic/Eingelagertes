import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
		
	public static void main(String[] args) throws IOException {
	
		try {
			Socket socket = new Socket("localhost",27015);
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			String s;
			Scanner scanner = new Scanner(System.in);
				System.out.println("Sag etwas: ");
			do {
				s = scanner.nextLine();
				out.write(s);
				out.flush();
				
				s = br.readLine();
					System.out.print(s);
					
			}while(!s.equals("exit"));
				socket.close();
				scanner.close();
				
			}catch (UnknownHostException e) {
				e.printStackTrace();
			
		}	
	}
}