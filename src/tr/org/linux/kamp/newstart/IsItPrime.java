package tr.org.linux.kamp.newstart;

import java.util.Scanner;

public class IsItPrime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("A number please");
		int num = input.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <=Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + " is a prime");
		}
		else {
			System.out.println(num + " is not a prime");
		}
	}
}
