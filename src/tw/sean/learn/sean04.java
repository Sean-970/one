package tw.sean.learn;

public class sean04 {
	public static void main(String[] args) {
		double temp = Math.random() ;
//		System.out.println(temp);
		int score = (int)(temp * 6)+1;  //0~100 共101整數
		System.out.println(score);
		
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		}
	}


