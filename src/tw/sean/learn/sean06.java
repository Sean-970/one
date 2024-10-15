package tw.sean.learn;

public class sean06 {

	public static void main(String[] args) {
		int i = 0;
		for ( printsean(); i<10 ;printLine()) {
			System.out.println(i++);
		}
		System.out.println(i);
	}
	
	static void printsean() {
		System.out.println("sean");
		printLine();
	}
	static void printLine() {
		System.out.println("---");
	}
}

