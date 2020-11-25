import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("localhost",2323) ;
		//flot d'entrer 
		Scanner in = new Scanner(client.getInputStream());
		String line = in.nextLine() ;
		System.out.println("Server -----> :"+line);
		
	}
	
	
	
	
	
	
	
}
