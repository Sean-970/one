package tw.sean.learn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sean48 {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("dir1/ns1hosp.csv");
//				System.out.println();    //try()裡不可有敘述句
				
				BufferedReader br = new BufferedReader(reader);) {
			
			
			String line;
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				
				String[] data = line.split(",");
				System.out.printf("%s:%s:%s:%s\n",data[1],data[2],data[4],data[7]);
			}
			
			
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
