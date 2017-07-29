package tr.org.kamp.linux.lists;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ListingArrays {

	public static void main(String[] args) {
		ListingArraysObject aListDemo = new ListingArraysObject();
		aListDemo.addElement("Hello");
		aListDemo.addElement("Ola");

		System.out.println("Everything works");
		System.out.println(aListDemo.doesHaveAnyElements());
		ArrayList<String> listDemo = new ArrayList<>();
		aListDemo.addElement("Bonjour");
		listDemo.add("Aloha");
		listDemo.add("Privet");
		listDemo.addAll(aListDemo.getListDemo());

		for (String element : listDemo) {
			System.out.println(element);

		}

		boolean removeResult = aListDemo.removeElement("Ola");
		if (removeResult) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		aListDemo.removeElement("Ola");
		for (String element : listDemo) {
			System.out.println(element);

		}
		ArrayList<String> listOne = new ArrayList<>();
		int input = 0;
		Scanner sc = new Scanner(System.in);
		while (input != -1) {
			System.out.println("1- Add element: ");
			System.out.println("2- Remove element: ");
			System.out.println("3- Check existence: ");
			System.out.println("4- Show size: ");
			input = sc.nextInt();
			switch (input) {
			case 1:
				boolean result = listOne.add(sc.next());
				if (result) {
					System.out.println("Successfully added " + listOne.get(listOne.size() - 1));
				} else {
					System.out.println("Failed");
				}
				break;
			case 2:
				boolean result2 = listOne.remove(sc.next());
				;
				if (result2) {
					System.out.println("Successfully removed ");
				} else {
					System.out.println("Failed");
				}
				break;
			case 3:
				boolean result3 = listOne.contains(sc.next());
				if (result3) {
					System.out.println("It exists");
				} else {
					System.out.println("Item can not be found");
				}
				break;
			case 4:
				System.out.println(listOne.size());
				break;
			default:
				break;
			}

		}

	}

}
