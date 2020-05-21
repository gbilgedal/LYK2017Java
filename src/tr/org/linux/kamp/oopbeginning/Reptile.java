package tr.org.linux.kamp.oopbeginning;

abstract class Reptile extends Animal {
	public Reptile(String eyeColour, String furColour, int age, String specie) {
		super(eyeColour, furColour, age, specie);
		// TODO Auto-generated constructor stub
	}

	abstract void crawl();
	
}
