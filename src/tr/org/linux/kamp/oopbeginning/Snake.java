package tr.org.linux.kamp.oopbeginning;

public class Snake extends Reptile implements Herbivore, Carnivore{
	public Snake(String eyeColour, String furColour, int age, String specie) {
		super(eyeColour, furColour, age, specie);
		// TODO Auto-generated constructor stub
	}
	void hasNoLegs() {
		System.out.println("Snakes have no legs");
	}
	@Override
	public void hunt() {
		System.out.println("Some snakes hunt");
		
	}

	@Override
	public void eatsGrass() {
		
		System.out.println("Some snakes eat grass");
	}
	@Override
	void crawl() {
		System.out.println("Snakes crawl");
		
	}
	
	

}
