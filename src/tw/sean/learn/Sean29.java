package tw.sean.learn;

import java.util.LinkedHashSet;

public class Sean29 {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		System.out.println(names.add("Sean"));
		System.out.println(names.add("Eric"));
		names.add("Tony");
		names.add("Ian");
		names.add("Mark");
		System.out.println(names.add("Sean")); // 重複 回傳 False
		System.out.println("------");
		
		for (String name: names) {
			System.out.println(name);
		}
		

	}

}
