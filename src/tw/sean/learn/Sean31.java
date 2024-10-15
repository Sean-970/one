package tw.sean.learn;

import java.util.LinkedList;
import java.util.List;

public class Sean31 {

	public static void main(String[] args) {
		List<String> times = new LinkedList<String>();
		
		times.add(0,"10:20:30");
		
		times.add(0,"10:20:35");
		times.add(0,"10:20:39");
		times.add(0,"10:20:48");
		times.add(0,"10:20:51");
		
		
		
		
		System.out.println("---------------");
		for(String time :times) {
			System.out.println(time);
		}
		
	}

}
