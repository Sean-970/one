package tw.sean.learn;

import java.util.Random;

import tw.sean.apis.TWId;

public class Sean17id {

	public static void main(String[] args) {
//		System.out.println(TWId.isRight("L125355033"));
//		
//		Random rand = new Random();
//		System.out.println(rand.nextInt(2));
		
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId('B');
		TWId id4 = new TWId(true,'Y');
//		TWId id5 = TWId.newTWId("L125355033");
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
//		System.out.println(id5.getId());
		
		
	}

}
