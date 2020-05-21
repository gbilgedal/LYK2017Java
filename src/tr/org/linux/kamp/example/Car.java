package tr.org.linux.kamp.example;

import tr.org.linux.kamp.example.Vehicle.GasType;

public class Car extends Vehicle {

	public Car(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofuel,
			boolean hasAutopilot, GasType gasoline) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofuel, hasAutopilot, gasoline);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeMotor() {
		System.out.println("VIIINN");
		// TODO Auto-generated method stub
	}

	@Override
	public void processGas() {
		System.out.println("Benzin yakıyor");
		// TODO Auto-generated method stub

	}

	@Override
	public void setGear() {
		int gear = 3;
		// TODO Auto-generated method stub

	}

	


}
