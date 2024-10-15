package tw.sean.learn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpClient {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("url");
			URLConnection conn =url.openConnection();
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(bin));
			
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			bin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();     
		}
		

	}

}
