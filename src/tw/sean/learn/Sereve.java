package tw.sean.learn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Sereve {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(5695);
			Socket socket = server.accept();
			
			) {
			String urIp = socket.getInetAddress().getHostAddress();
			String fname = String.format(urIp, urIp);
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fname));
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			
			byte [] buf = new byte[4*1024];
			int len;
			while ((len = bin.read(buf))!=-1) {
				bout.write(buf,0,len);
			}
			
			bout.flush();
			server.close();
			System.out.println(urIp +  " => ok" );
		} catch (IOException e) {
			
			System.out.println(e);
		}

	}

}
