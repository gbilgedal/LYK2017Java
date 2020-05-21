package tr.org.linux.kamp.printingExample;

public class PDF extends Document {
	private String author;
	public PDF(String s ) {
		setContent(s);
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	void printDocument(Document a) {
		System.out.println("PDF is getting printed.");
		System.out.println(super.getContent());
		
		
	}
	

}
