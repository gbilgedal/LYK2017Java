package tr.org.linux.kamp.grbgcollector;

public class GcTest {

	int value;
	
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("Çalıştı");
	}
}