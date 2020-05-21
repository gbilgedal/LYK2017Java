package tr.org.linux.kamp.classes;

public class Animal {
	private static String colour;
	private static int legNumber;

	public Animal() {
		System.out.println("Animal has been set");
	}

	public void walks() {
		System.out.println("Animal spoke");
	}

	public void eats() {
		System.out.println("Animal ate");

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		Animal.colour = colour;
	}

	public int getLegNumber() {
		return legNumber;
	}

	public void setLegNumber(int legNumber) {
		Animal.legNumber = legNumber;
	}
}
