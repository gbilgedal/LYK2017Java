package tr.org.linux.kamp.oopexample;

public class TestClass {
	public static void main(String[] args) {
		Vampire roth = new Vampire("Roth");
		Dragon dovahkiin = new Dragon("Alduin");
		roth.bite();
		roth.canGetScaredByGarlic();
		roth.canMakeYouScared();
		
		dovahkiin.breathsFire();
		dovahkiin.canMakeYouScared();
	}

}
