import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket listen=new ServerSocket(2323);
			while(true) {
				
				System.out.println("Wait for a new client.....");
				Socket soc=listen.accept();
				
				//try {
				System.out.println("New client connected!!");
				PrintWriter out = new PrintWriter(soc.getOutputStream(), true) ;
				out.println("to err is human but to really foul things up you need a computer");
				
				/*	}finally {
					System.out.println("closing.....");
					soc.close();
				}*/
				
				
				
				
			}
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
