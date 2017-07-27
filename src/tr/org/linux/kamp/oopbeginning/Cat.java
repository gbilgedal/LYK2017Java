package tr.org.linux.kamp.oopbeginning;

public class Cat extends Mammal implements Carnivore {
	void meow() {
		System.out.println("Meow Meow");
	}
	void scratch() {
		System.out.println("A cute kitty may sometimes scratch something :p");
	}
	@Override
	public void hunt() {
		System.out.println("Cats may hunt things");
		
	}
	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		
	}

}
