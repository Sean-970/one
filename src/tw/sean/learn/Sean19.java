package tw.sean.learn;

public class Sean19 {

	public static void main(String[] args) {
		Sean191 obj1 = new Sean191();
		obj1.m1();obj1.m2();
		
		Sean192 obj2 = new Sean192();
		obj2.m1(); obj2.m2();obj2.m3();
		
		Sean191 obj3 = new Sean192();
		obj3.m1();obj3.m2();
		
		Sean192 obj4 = (Sean192)obj3;
		obj4.m1();obj4.m2();obj4.m3();
		
		Sean191 obj7 = new Sean192();
//		Sean193 obj8 = (Sean193)obj7;
		
		if (obj7 instanceof Sean191) {
			System.out.println("Yes1");
		}else {
			System.out.println("No1");
		}
		
		if (obj7 instanceof Sean192) {
			System.out.println("Yes2");
		}else {
			System.out.println("No2");
		}
		
		if (obj7 instanceof Sean193) {
			System.out.println("Yes3");
		}else {
			System.out.println("No3");
		}
		
		
	}

}

class Sean191 {
	void m1() {
		System.out.println("Sean191.m1()");
	}
	void m2() {
		System.out.println("Sean191.m2()");
	}
}
class Sean192 extends Sean191 {
	void m2() {
		System.out.println("Sean192.m2()");
	}
	void m3() {
		System.out.println("Sean192.m3()");
	}
}

class Sean193 extends Sean191 {
	void m2() {
		System.out.println("Sean193.m2()");
	}
	void m3() {
		System.out.println("Sean193.m3()");
	}
}