package tr.org.linux.kamp.fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println(i);

				System.out.println("Fizz");
			}
			if (i % 3 != 0 && i % 5 == 0) {
				System.out.println(i);

				System.out.println("Buzz");
			}

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);

				System.out.println("Fizz Buzz");
			}

		}

	}
}
