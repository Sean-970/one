package tw.sean.learn;

public class Sean20 {

	public static void main(String[] args) {
		Sean201 obj1 = new Sean201();
		Sean202 obj2 = new Sean202();
		Sean203 obj3 = new Sean203();
		att(obj1);
		att(obj2);
		att(obj3);
	}
	static void att(Sean201 obj) {
		obj.m1();
	}
}
class Sean201 {
	void m1() {
		System.out.println("Sean201.m1()");
	}
}

class Sean202 extends Sean201 {
	void m1() {
		System.out.println("Sean202.m1()");
	}
}

class Sean203 extends Sean201 {
	void m1() {
		System.out.println("Sean203.m1()");
	}
}
