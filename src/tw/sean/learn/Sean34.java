package tw.sean.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sean34 {

		public static void main(String[] args) {
			try {
				FileInputStream fin = new FileInputStream("./dir1/file1.txt");
//				int c= fin.read();
//				System.out.println((char)c);
//				
//				c = fin.read();
//				System.out.println((char)c);
				
				
				
				int a;
				while((a = fin.read())!= -1) {
					System.out.print((char)a);
				}
				
				
				fin.close();
				System.out.println();
				System.out.println("ok");
			} catch (Exception e) {
				System.out.println(e);
			} 
	}
} 
				

				
	
