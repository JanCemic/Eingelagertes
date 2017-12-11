package v1_ChatServer_ClientThread1;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientThread1 {

		public static void main(String ags[]) throws IOException{
				BufferedReader br = null;
				PrintWriter out = null;
				boolean vrbnd = true;
				String s;
			
			try {
					//Socket
				Socket socket = new Socket("localhost", 27015);
					//lesen
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());
				br = new BufferedReader(isr);
					//schreiben
				out = new PrintWriter(socket.getOutputStream(), true);
			}
			catch(UnknownHostException e) {
				e.printStackTrace();
			}
				System.out.print("Sag etwas: ");
			while(vrbnd == true) {
				Scanner scnr = new Scanner(System.in);

				s = scnr.next();
					System.out.println("Du: " +s);
				if(br.readLine() == ""){
					}
				else if(s.equals("bb")) {
					vrbnd = false;
					}
				else{
					out.print(s);					
					System.out.println("C1: " +br.readLine());
				}				
			}
		}
	}

