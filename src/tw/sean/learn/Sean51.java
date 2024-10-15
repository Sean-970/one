package tw.sean.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Sean51 {

	public static void main(String[] args) {
		Sean513 obj = new Sean513();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new FileOutputStream("dir1/test.ok"));
		oout.writeObject(obj);
		oout.flush();
		oout.close();
		System.out.println("ok");
		System.out.println("-----");
		
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/test.ok"));
		oin.readObject();
		oin.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
class Sean511 implements Serializable{
	Sean511(){System.out.println("Sean511()");}
}
class Sean512 extends Sean511{
	Sean512(){System.out.println("Sean512()");}
}
class Sean513 extends Sean512{
	Sean513(){System.out.println("Sean513()");}
}