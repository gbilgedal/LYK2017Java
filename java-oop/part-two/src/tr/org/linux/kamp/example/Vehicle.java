package tr.org.linux.kamp.example;

import tr.org.linux.kamp.example.Plane.LiftOffType;

abstract class Vehicle implements Drivable {
	private String brand;
	private String model;
	private int speed;
	private int capacity;
	private int numberOfWheels;
	private boolean hasAerofoil;
	private boolean hasAutopilot;
	private GasType gastype;
	enum GasType {
		GASOLINE, DIESEL, BIODIESEL, LPG, ELECTRIC, JETFUEL
	}//protecteds are used by subclasses
	protected String gasTypeMessage() {
		switch (gastype) {
		case GASOLINE:
			return "Your vehicle uses" + gastype;
		case DIESEL:
			return "Your vehicle uses" + gastype;
		case BIODIESEL:
			return "Your vehicle uses" + gastype;
		case LPG:
			return "Your vehicle uses" + gastype;
		case ELECTRIC:
			return "Your vehicle uses" + gastype;
		case JETFUEL:
			return "Your vehicle uses" + gastype;
		default:
			break;
		}
		return "none";
	}
	
	

	public Vehicle(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutopilot, GasType gastype) {
		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.capacity = capacity;
		this.numberOfWheels = numberOfWheels;
		this.hasAerofoil = hasAerofoil;
		this.hasAutopilot = hasAutopilot;
		this.gastype = gastype;
	}





	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public boolean isHasAerofuel() {
		return hasAerofoil;
	}
	public void setHasAerofuel(boolean hasAerofuel) {
		this.hasAerofoil = hasAerofuel;
	}
	public boolean isHasAutopilot() {
		return hasAutopilot;
	}
	public void setHasAutopilot(boolean hasAutopilot) {
		this.hasAutopilot = hasAutopilot;
	}

	public void processGas() {
		// TODO Auto-generated method stub
		
	}
	

}
