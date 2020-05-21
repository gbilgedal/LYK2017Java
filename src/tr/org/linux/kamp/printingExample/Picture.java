package tr.org.linux.kamp.printingExample;

public class Picture extends Document {
	public Picture(String a) {
		setContent(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printDocument(Document a) {
		System.out.println("Pictr is getting printed");
		System.out.println(a.getContent());
		
	}
	
}
