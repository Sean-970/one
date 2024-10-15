package tw.sean.learn;

public class Sean38 {

	public static void main(String[] args) {
		m1();
		System.out.println("Game Over");

	}
	
	static void m1() {
		System.out.println("1");
		int[] a = {1,2,3,4,};
		
		try {
			System.out.println(a[10]);
			System.out.println("Sean");
			//return;
		} catch(Exception e) {
			System.out.println(e);
			return;
		}finally { 
			System.out.println("f");
			
		}
		
		System.out.println("OK");
	}
}
