package tw.sean.learn;

import tw.sean.apis.Bike;

public class Sean16 {

	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1.length());
		
		byte [] b1 = {97,98,99,100};
		String s2 = new String(b1);
		System.out.println(s2.length());
		System.out.println(s2);
		
		Bike b2 = new Bike();
		System.out.println(b2 ); //印出記憶體位置
		
		String s3 = "Sean"; //雙引號就是字串物件
		System.out.println(s3);
		
		String s4 = "Sean";
		String s5 =new String("Sean");//s5 物件實體跟s3 s4不一樣
		String s6 =new String("Sean");
		System.out.println(s5==s6);
		//
		System.out.println("Sean".charAt(0));
		
		System.out.println(s3.concat("Chen"));
		System.out.println(s3);
		
		

	}

}
