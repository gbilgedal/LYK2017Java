package tr.org.linux.kamp.classes;

public class AnimalTest {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.setColour("black&white");
		a.setLegNumber(4);
		a.eats();
		a.walks();
		System.out.println("Animal a has " + a.getLegNumber() + " legs and has a fur of " + a.getColour());
	}

}
