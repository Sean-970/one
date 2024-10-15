package tw.sean.learn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.net.InetAddress;
import java.net.Socket;



public class Client {

	public static void main(String[] args) {
		File source = new File("dir1/small.jpg");
		try(	BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
				Socket client = new Socket(InetAddress.getByName(""),5695);
			
			BufferedOutputStream bout =new BufferedOutputStream(client.getOutputStream())) {
			
			byte[] buf = new byte [(int)source.length()];
			bin.read(buf);
			bout.write(buf);
			

			
			System.out.println("send ok");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}