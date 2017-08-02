package tr.org.linux.kamp.printingExample;

import java.util.ArrayList;
import java.util.Random;

public class MainApp {
	private PDF pdf;
	private Picture pici;

	public static void main(String[] args) {

		ArrayList<Document> docs = new ArrayList<Document>();
		
		Random rgen = new Random();
		
		int na = rgen.nextInt(2);
		docs.add(new PDF("Hola"));
		docs.add(new Picture("Content"));
		docs.get(na).getText();
		docs.get(na).printDocument(docs.get(na));
	}

}
