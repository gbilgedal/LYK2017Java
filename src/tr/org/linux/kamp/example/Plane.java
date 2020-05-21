package tr.org.linux.kamp.example;

public class Plane extends Vehicle {
	private LiftOffType lomessage;

	public int getMaxFeet() {
		return maxFeet;
	}

	public void setMaxFeet(int maxFeet) {
		this.maxFeet = maxFeet;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public boolean isAutoPilotActive() {
		return isAutoPilotActive;
	}

	public void setAutoPilotActive(boolean isAutoPilotActive) {
		this.isAutoPilotActive = isAutoPilotActive;
	}


	private int maxFeet;
	private String flightCode;
	private boolean isAutoPilotActive;
	private static LiftOffType liftOffType;
	private static GasType gasType;
	

	enum LiftOffType {
		VERTICALLY, HORIZONTALLY;

	}

	String liftOffMessage() {
		switch (lomessage) {
		case VERTICALLY:
			return "Your vehicle lifts off " + lomessage;
		case HORIZONTALLY:
			return "Your vehicle lifts off " + lomessage;
		default:
			break;
		}
		return "none";
	}

	

	public Plane(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutopilot, GasType gastype, LiftOffType lomessage) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAutopilot, gastype);
		this.lomessage = lomessage;
		this.maxFeet = maxFeet;
		this.flightCode = flightCode;
		this.isAutoPilotActive = isAutoPilotActive;
	}

	@Override
	public void executeMotor() {
		System.out.println("Ready to fly");
		// TODO Auto-generated method stub

	}

	@Override
	public void processGas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setGear() {
		// TODO Auto-generated method stub

	}

}
