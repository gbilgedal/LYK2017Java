package tr.org.linux.kamp.arrays2;

import java.util.Random;

public class ArrayGenerator {
	private static Random rgen = new Random();
	private static int bound = 10;
	private static int[] matrix = new int[bound];

	public static void main(String[] args) {
		generator();
		printer();
		sorter();
		System.out.println();
		printer();
		System.out.println();
		System.out.println(searcher(2));
	
		lastIndexFinder(matrix);

	}

	public static int[] generator() {
		int item;
		for (int i = 0; i < matrix.length; i++) {// if it was 2d, 2 for loops
			item = rgen.nextInt(10);
			matrix[i] = item;
		}

		return matrix;
	}

	public static void printer() {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i] + " ");
		}
	}

	public static void sorter() {
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 1; j < matrix.length; j++) {
				if (matrix[j - 1] > matrix[j]) {
					int temp = matrix[j - 1];
					matrix[j - 1] = matrix[j];
					matrix[j] = temp;
				}

			}
		}

	}
	public static String searcher(int m){
		int item;
		boolean result = false;
		for(int i =0; i<matrix.length; i++) {
			if(matrix[i]== m) {
			result = true;
			break;
			}
			
		}
		return "boolean of number " + m +": " + String.valueOf(result); 
	}


	public static void lastIndexFinder(int[] matrix) {
		int i=0;
		while ( i < matrix.length) {
			i++;
		}
		System.out.println("Last index is :" +matrix[i-1]);
			}
}
	

