package tw.sean.learn;

import java.util.Arrays;

public class Pokerv3 {

	public static void main(String[] args) {
		final int nums = 52;
		int[] poker = new int[nums];
		for(int i=0; i<poker.length;i++) poker[i] = i;
		
		for (int i=nums-1; i>0 ; i--) {
			int rand = (int)(Math.random()*(i+1));
			//poker[rand]<=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		for(int card : poker) {
			System.out.println(card);
		}
		System.out.println("---發牌");
		//發牌
		
		int[][] players = new int[4][13];  //四個玩家發給13張牌
		for(int i = 0; i<poker.length;i++) {
			players[i%4][i/4] = poker[i];
		}
		
		String[] suit = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for (int[] player:players) {
			
			Arrays.sort(player);
			
			for(int card:player) {
				System.out.printf("%s%s ", suit[card/13],values[card%13]);
		}
		System.out.println();
		
	}

   }
}
