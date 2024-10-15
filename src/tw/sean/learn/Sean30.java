package tw.sean.learn;

import java.util.LinkedList;
import java.util.List;

public class Sean30 {

	public static void main(String[] args) {
		List list = new LinkedList<>();
		list.add("Sean");
		list.add(123);
		list.add(0,12.3); //指定第0號位置
		list.add(true);
		list.add(123);
		list.add("Sean");
		
		list.add(list.remove(3));//第三位抽出來到最後
		
		System.out.println(list.size());
		System.out.println("-------");
		for (Object obj:list) {
			System.out.println(obj);
		}
	}

}
