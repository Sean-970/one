package tw.sean.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sean41 {

		public static void main(String[] args) {
			try {
				File source = new File("./dir1/file2.txt"); 
				FileInputStream fin = new FileInputStream(source);
				
				
				int len; byte [] buf = new byte[(int)source.length()];
				fin.read(buf);
				System.out.println(new String(buf));
				
				
//				len = fin.read(buf);
//				System.out.println(new String(buf,0,len));
				
//				while( (len = fin.read(buf)) != -1) {
//					System.out.print(new String(buf,0,len));
//				}

				
				fin.close();
				System.out.println();
				System.out.println("ok");
			} catch (Exception e) {
				System.out.println(e);
			} 
	}
} 
				

				
	
