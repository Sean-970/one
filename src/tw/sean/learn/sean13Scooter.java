package tw.sean.learn;

import tw.sean.apis.Scooter;

public class sean13Scooter {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		s1.changeGear(4);
		s1.upSpeed();s1.upSpeed();s1.upSpeed();s1.upSpeed();
		s1.downSpeed();
		System.out.println(s1.getSpeed());
		System.out.println(s1.getColor());
	}

}
