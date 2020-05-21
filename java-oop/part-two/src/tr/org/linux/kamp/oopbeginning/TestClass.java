package tr.org.linux.kamp.oopbeginning;

public class TestClass {
	public static void main(String[] args) {
		Cat lily = new Cat("Black", "Black", 3, "Scottish Shorthair");
		lily.meow();
		lily.scratch();
		Snake hale = new Snake("red", "black", 12, "normal snake");
		hale.hasNoLegs();
		MockingBird fuzzy = new MockingBird("black", "white", 2, "Lovely Mocking Bird");
		fuzzy.tweet();
		fuzzy.fly();

		Object o = lily;
		Animal a = lily;
		Carnivore c = lily;
		Mammal m = lily;
	}

}
