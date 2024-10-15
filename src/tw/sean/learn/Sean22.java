package tw.sean.learn;

public class Sean22 {

	public static void main(String[] args) {
		Sean221 obj1 = new Sean222();
		Sean223 obj2 = new Sean222();
		Sean222 obj3 = new Sean222();
		obj1.m1();obj1.m2();
		obj2.m3();obj2.m4();
		obj3.m1();obj3.m2();obj3.m3();obj3.m4();
		

	}

}
interface Sean221 { 
	void m1();
	void m2();
}

interface Sean223 { 
	void m3();
	void m4();
}
 class Sean222 implements Sean221,Sean223 {
	 public void m1() {}
	 public void m2() {}
	 public void m3() {}
	 public void m4() {}
}