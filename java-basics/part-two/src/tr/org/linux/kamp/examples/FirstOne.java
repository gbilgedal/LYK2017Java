package tr.org.linux.kamp.examples;

//later(primes)
import java.util.Scanner;

public class FirstOne {
	public static void main(String[] args) {

		System.out.println("How many primes you want to learn?");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		int num = 2;
		int addPrime = 0;
		
		boolean isPrime = true;
		while (addPrime < amount) {
			isPrime = true;
			for (int i = 2; i < num ; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				addPrime++;
				System.out.println(num + "Asaldır");
			}
			num++;
		}
	}
}

	
