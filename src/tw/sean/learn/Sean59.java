package tw.sean.learn;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Sean59 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout  = new FileOutputStream("dir2/yahoo.jpg");
			
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/Xt6n22N2ub97183ktluDRg--/YXBwaWQ9aGlnaGxhbmRlcjt3PTk2MDtoPTUzODtjZj13ZWJw/https://media.zenfs.com/ko/setn.com.tw/a7432203716f22026e91736d9dd48380");
			URLConnection conn =  url.openConnection();
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());

			byte [] buf = new byte [4*1024]; int len;
			while((len = bin.read(buf)) !=-1){
				fout.write(buf,0,len);
			}
			
			
			
			bin.close();
			fout.flush();
			fout.close();
			System.out.println("ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}