package tr.org.linux.kamp.oopexample;

public class Dragon extends Monster implements canFly {
	void breathsFire(){
		System.out.println(getName()+ "can heat up your room with its breath");
	}

	public Dragon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void canMakeYouScared() {
		// TODO Auto-generated method stub
		System.out.println("A dragon is scary and beautiful at the same time");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void frighten() {
		// TODO Auto-generated method stub
		
	}
	

}
