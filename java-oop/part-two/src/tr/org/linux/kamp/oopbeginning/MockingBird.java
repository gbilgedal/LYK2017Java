package tr.org.linux.kamp.oopbeginning;

public class MockingBird extends Bird implements Herbivore {
	public MockingBird(String eyeColour, String furColour, int age, String specie) {
		super(eyeColour, furColour, age, specie);
		// TODO Auto-generated constructor stub
	}

	private int wings;
	private String featherColour;
	

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public String getFeatherColour() {
		return featherColour;
	}

	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}

	@Override
	public void eatsGrass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fly() {
		System.out.println("Flies like a bird!");
		// TODO Auto-generated method stub
		
	}

	@Override
	void tweet() {
		System.out.println("sings beautiful songs");
		// TODO Auto-generated method stub
		
	}

}
