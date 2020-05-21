package tr.org.linux.kamp.oopexample;

public class Vampire extends Monster implements canFly{
	public Vampire(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	void bite() {
		System.out.println("Ouch, Vampire "+ getName() +"bit me!");
		
	}

	@Override
	public void canMakeYouScared() {
		// TODO Auto-generated method stub
		System.out.println("Brrh, vampires are scary");
	}

	@Override
	public void fly() {
		System.out.println("They can fly and also become bats, how fascinating.");
		// TODO Auto-generated method stub
		
	}

	@Override
	void frighten() {
		// TODO Auto-generated method stub
		
	}
	void canGetScaredByGarlic(){
		System.out.println(getName()+" hates garlic");
	}

}
