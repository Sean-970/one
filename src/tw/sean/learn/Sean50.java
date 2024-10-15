package tw.sean.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import tw.sean.apis.Student;

public class Sean50 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/brad.score");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			System.out.println(s1);
			System.out.println(s1.sum());
			System.out.println(s1.avg());
			
			oin.close();
			System.out.println("ok");
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}

}
