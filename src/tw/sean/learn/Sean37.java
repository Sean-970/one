package tw.sean.learn;

public class Sean37 {

	public static void main(String[] args) {
		Sean371 obj  = new Sean371();
		try {
			obj.m1();
		} catch (Exception e) {
			
		}

	}

}
class Sean371{
	void m1() throws Exception {
		System.out.println("Sean371.m1()");
		m2();
	}
	void m2() throws Exception {
		System.out.println("Sean371.m2()");
		m3();
	}
	void m3() throws Exception {
		System.out.println("Sean371.m3()");
		throw new Exception();	
	}
}
