package tw.sean.learn;

import tw.sean.apis.Scooter;
import tw.sean.apis.Bike;
import tw.sean.apis.Car;

public class sean14 {

	public static void main(String[] args) {
		Scooter s1 = new Scooter("red"); 
		System.out.println(s1.getColor());
		
		Bike b1 = new Bike();
		System.out.println(b1);
		Car c1 = new Car(3);
				

	}

}
