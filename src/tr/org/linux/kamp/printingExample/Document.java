package tr.org.linux.kamp.printingExample;

public abstract class Document {
	private String content;
	private  int time;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	String getText() {
		return content;
	}

	abstract void printDocument(Document a);
	public Document() {
		// TODO Auto-generated constructor stub
	}

	public Document(String content, int time) {
		super();
		this.content = content;
		this.time = time;
	}

}
