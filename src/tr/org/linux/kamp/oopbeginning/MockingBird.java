package tr.org.linux.kamp.oopbeginning;

public class MockingBird extends Bird implements Herbivore {
	int wings;
	String featherColour;
	

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
