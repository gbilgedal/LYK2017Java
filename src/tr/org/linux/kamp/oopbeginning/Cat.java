package tr.org.linux.kamp.oopbeginning;

public class Cat extends Mammal implements Carnivore {
	public Cat(String eyeColour, String furColour, int age, String specie) {
		super(eyeColour, furColour, age, specie);
		// TODO Auto-generated constructor stub
	}
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
