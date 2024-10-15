package tw.sean.learn;

public class sean07Array1 {

	public static void main(String[] args) {
		int [] ary1; //陣列物件
		ary1 = new int[3];  //byte,short,int,long第一次給值就是初始化，預設值都是0 浮點數是0.0
		System.out.println(ary1[0]);
		System.out.println(ary1[1]);
		System.out.println(ary1[2]);
		System.out.println(ary1.length); //裡面有三個元素
		ary1[1] = 100;
		ary1[2] = 123;
//		ary1[3] = 300;
		System.out.println("---");
		
		for (int i=0;i<ary1.length;i++) {
			System.out.println(ary1[i]);
		}
		
		System.out.println("---");
		
		for (int v :ary1) {
			System.out.println(v); 
		}
		
		
		
	}

}
