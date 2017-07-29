package tr.org.kamp.linux.lists;

import java.util.ArrayList;

public class ListingArraysObject {
	private ArrayList<String> listDemo;

	public ListingArraysObject() {
		listDemo = new ArrayList<String>();

	}

	public void addElement(String e) {
		listDemo.add(e);
	}

	public boolean removeElement(String e) {
		return listDemo.remove(e);

	}

	public boolean hasElementX(String e) {
		return listDemo.contains(e);
	}

	public boolean doesHaveAnyElements() {
		return !listDemo.isEmpty();
	}

	public ArrayList<String> getListDemo() {
		return listDemo;
	}

	public void setListDemo(ArrayList<String> listDemo) {
		this.listDemo = listDemo;
	}

}
