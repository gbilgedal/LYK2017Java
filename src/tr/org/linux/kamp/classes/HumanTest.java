package tr.org.linux.kamp.classes;

public class HumanTest {
	public static void main(String[] args) {

					// construction method
		Human ellie = new Human();
		Human matt = new Human("matt", "man", 24);

		// Statuses of object
		ellie.age = 21;
		ellie.sex = "woman";
		ellie.name = "ellie";
		// Behaviors of object
		ellie.sleepin();
		ellie.eatin();
		ellie.movin();
		ellie.thinkin();
		matt.sleepin();
		matt.eatin();
		matt.movin();
		matt.thinkin();

	}
}
