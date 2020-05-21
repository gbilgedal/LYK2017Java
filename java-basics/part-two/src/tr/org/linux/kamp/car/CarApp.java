package tr.org.linux.kamp.car;
public class CarApp {
	public static void main(String[] args) {
		Car myCar = new Car();

		Car myCar2 = new Car(6, 75, "Mercedes");

		myCar.setBrand("Volkswagen");

		myCar2.setGear(3);

		myCar2.speedUp(65);

		System.out.println(myCar2.getSpeed());

		System.out.println(myCar2.getGear());

		System.out.println(myCar2.getBrand());

		myCar2.speedDown(25);

		System.out.println(myCar2.getSpeed());
		
		System.out.println(myCar.getBrand());

	}
}
