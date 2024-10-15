package tw.sean.learn;

public class Sean21 {

	public static void main(String[] args) {
		Sean211 obj1 = new Sean211() {
			void m2() {
				System.out.println("Sean211.m2()");
			}
		};
		obj1.m1();obj1.m2();
		
		Sean211 obj2 = new Sean212();
		obj2.m1();obj2.m2();

	}

}

abstract class Sean211 {
	void m1() {System.out.println("Sean211.m1()");}
	abstract void m2(); //抽象方法 必須對外宣告
}
 class Sean212 extends Sean211 {
	void m2() {System.out.println("Sean212.m2()");}
}

abstract class Sean213 extends Sean211 {
	void m2() {System.out.println("Sean213.m3()");}
}