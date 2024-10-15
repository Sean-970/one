package tw.sean.learn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Sean53 {

	public static void main(String[] args)  {
		String mesg = "波逼波逼波波逼波";
		byte[] mesgBuf = mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(mesgBuf, mesgBuf.length,
					InetAddress.getByName("10.0.100.255"), 8888); 
					
			
			socket.send(packet);
			
			
			socket.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
