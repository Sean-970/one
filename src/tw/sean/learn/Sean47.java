package tw.sean.learn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sean47 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("./dir1/file2.txt"))  {
			
			int c;
			while((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			fr.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
