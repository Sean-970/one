package tw.sean.learn;

import java.util.HashSet;

import tw.sean.apis.Bike;

public class Sean27 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("Sean"); 
		set.add(12);
		set.add(12.3);
		//12 =>new Integer(12) auto-boxing 已經幫你包成物件
		set.add("Sean");
		set.add(new Bike());
		set.add(12);
		System.out.println(set.size());  //set不重複 4
		System.out.println(set);
	}

}
