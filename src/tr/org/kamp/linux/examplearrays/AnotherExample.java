package tr.org.kamp.linux.examplearrays;

import java.util.Arrays;

public class AnotherExample {
	public static void main(String[] args) {
		int anArray[] = { 1, 232, 12, 543, 65, 22 };
		printer(anArray);
		System.out.println();
		rewind(anArray);
		printer(anArray);
	}

	public static String rewind(int[] myArray) {
		for (int i = 0; i < (myArray.length / 2); i++) {
			int temp = myArray[i];
			myArray[i] = myArray[myArray.length - i - 1];
			myArray[myArray.length - i - 1] = temp;

		}
		return Arrays.toString(myArray);
	}

	public static void printer(int[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			System.out.print(anArray[i] + " ");
		}
	}

}
