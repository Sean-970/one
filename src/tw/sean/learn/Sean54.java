package tw.sean.learn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Sean54 {

	public static void main(String[] args) {
		byte[] buf = new byte [4*1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);//接收封包
			socket.close();
			
			String urIP = packet.getAddress().getHostAddress();
			byte [] data = packet.getData();
			int len = packet.getLength();
			System.out.println("Receive ok");
			System.out.printf("%s => %s,",urIP,new String(data,0,len));
			System.out.println(data.length);
			System.out.println(len);
		} catch (Exception e) {
			System.out.println("e");
		}

	}

}
