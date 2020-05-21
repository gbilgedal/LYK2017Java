package tr.org.linux.kamp.example;

import tr.org.linux.kamp.example.Plane.LiftOffType;
import tr.org.linux.kamp.example.Vehicle.GasType;

public class AppPage {

	public static void main(String[] args) {
		Car one = new Car("Volkswagen", "Golf", 125, 60, 4, false, false, GasType.GASOLINE);
		Plane b = new Plane("Airbus", "Airbus", 130, 1300, 2, true, true,GasType.JETFUEL, LiftOffType.VERTICALLY);
		one.executeMotor();
		b.executeMotor();
		System.out.println(b.liftOffMessage());
		System.out.println(one.gasTypeMessage());

		
	}

}
