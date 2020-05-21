package tr.org.linux.kamp.random;

import java.util.Random;

public class RandomNums {
	public static void main(String[] args) {
		Random rgen = new Random();
		Random rgen1 = new Random();
		System.out.println("1:" + rgen.nextInt());
		System.out.println("2:" + rgen1.nextInt());
		System.out.println("1:" + rgen.nextBoolean());
		System.out.println("2:" + rgen1.nextBoolean());
		System.out.println("1:" + rgen.nextDouble());
		System.out.println("2:" + rgen1.nextDouble());
		System.out.println(Math.random());

	}

}
