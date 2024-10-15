package tw.sean.learn;

import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer57 {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(9487);
				Socket socket = server.accept();
				
				) {
			System.out.println("ok");
	}catch(Exception e) {
		
	}

  }
}
