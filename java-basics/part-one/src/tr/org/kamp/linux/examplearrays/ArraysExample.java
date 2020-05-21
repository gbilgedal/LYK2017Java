package tr.org.kamp.linux.examplearrays;

import java.util.Arrays;

public class ArraysExample {
	
	static int countermax=1;
	static int countermin=1;
	private static int[] myArray = new int[7];
	
	

	public static void main(String[] args) {
		int[] myArray = { 21, 32, 12, 4, 3, 2, 123,123};
		System.out.println(Arrays.toString(myArray));
		bestSorter(myArray);
		System.out.println("Sorted: " + Arrays.toString(myArray));
		System.out.println("Minimum value:" + betterMinFinder(myArray));
		System.out.println(countermin);
		System.out.println("Maximum value:" + betterMaxFinder(myArray));
		System.out.println(countermax);
		//int average = (sum / (myArray.length - (countermin + countermax)));
		
		System.out.println("sum:"
				+ avgCalc( myArray));

	}

	/*public static int maxFinder(int paramArray[]) {
		int max = paramArray[0];
		for (int i = 1; i < paramArray.length; i++) {
			if (paramArray[i] > max)
				max = paramArray[i];
		}
		return max;

	}*/
	public static int betterMaxFinder(int paramArray[]) {
		bestSorter(paramArray);
		
		int max = paramArray[paramArray.length -1];
		for(int i =1; i<paramArray.length-1;i++) {
			if(paramArray[i]==max)
				countermax++;
		}
		return max;
	}
	 public static int betterMinFinder(int paramArray[]) {
		 bestSorter(paramArray);
		 int min= paramArray[0];
		 int counter= 1;
			for(int i =1; i<paramArray.length;i++) {
				if(paramArray[i]==min)
					countermin++;
			}
		return min;
	 }

	/*public static int minFinder(int paramArray[]) {
		int min = paramArray[0];
		for (int i = 1; i < paramArray.length; i++) {
			if (paramArray[i] < min)
				min = paramArray[i];
		}
		return min;

	}
*/
	public static double avgCalc(int paramArray[]) {
		int sum = 0;
		for (int i = 1; i < paramArray.length; i++) {
			sum += paramArray[i];
		}
		return sum;
	}
	
	public static int[] bestSorter(int[] paramArray) {
		Arrays.sort(paramArray);
		return paramArray;
	}
}
