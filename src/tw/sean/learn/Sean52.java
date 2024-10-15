package tw.sean.learn;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class Sean52 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.cisco.com");
			System.out.println(ip);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}

	}

}
//TCP:連接導向
//UDP:非連接導向