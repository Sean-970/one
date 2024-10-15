package tw.sean.learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Sean42 {

	public static void main(String[] args) {
		 
		String mesg1 = "Hello,資展\n"; 
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file3.txt",true);
			fout.write(mesg1.getBytes());  //字串轉byte
			fout.flush();
			fout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
