package tr.org.linux.kamp.oopbeginning;

public class Deer extends Mammal implements Herbivore{
	
	public Deer(String eyeColour, String furColour, int age, String specie) {
		super(eyeColour, furColour, age, specie);
		// TODO Auto-generated constructor stub
	}
	public void jump() {
		System.out.println("Deers can jump");
	}
	@Override
	
	public void eatsGrass() {
		// TODO Auto-generated method stub
		System.out.println("Deers love eating grasss");
		
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		
	}
	
}
