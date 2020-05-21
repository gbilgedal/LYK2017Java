package tr.org.linux.kamp.oopbeginning;

abstract class Mammal extends Animal{
	
	public Mammal(String eyeColour, String furColour, int age, String specie) {
		super(eyeColour, furColour, age, specie);
		// TODO Auto-generated constructor stub
	}

	abstract void giveBirth();
}
