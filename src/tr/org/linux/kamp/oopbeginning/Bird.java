package tr.org.linux.kamp.oopbeginning;

abstract class Bird extends Animal {
	public Bird(String eyeColour, String furColour, int age, String specie) {
		super(eyeColour, furColour, age, specie);
		// TODO Auto-generated constructor stub
	}
	abstract void fly();
	abstract void tweet();
}
