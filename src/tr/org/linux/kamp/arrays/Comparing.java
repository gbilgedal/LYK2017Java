package tr.org.linux.kamp.arrays;

import java.util.Arrays;

public class Comparing {
	public static void main(String[] args) {
		int[] intArray1 = { 4, 6, 5, 3, 2, 74, 234 };
		int[] intArray2 = { 4, 6, 5, 3, 2, 74, 24 };

		boolean result = Arrays.equals(intArray1, intArray2);

		System.out.println(result);

	}
}
