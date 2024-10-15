package tw.sean.learn;

import tw.sean.apis.Bike;

public class sean12Bike {

	public static void main(String[] args) {
		Bike myBike = new Bike(); Bike urBike = new Bike();
		System.out.println(myBike.getSpeed());
		
		myBike.upSpeed();myBike.upSpeed();myBike.upSpeed();myBike.upSpeed();myBike.upSpeed();
		myBike.downSpeed();
		System.out.println(myBike.getSpeed());
		System.out.println("----");
		
		urBike.upSpeed();urBike.upSpeed();urBike.upSpeed();
		System.out.println(urBike.getSpeed());
		
		
	}

}
