package tr.org.linux.kamp.montecarlo;

import java.util.Random;

public class MonteCarlo {
	private static Random rgen = new Random();
	static int in;
	static int all;

	public static void main(String[] args) {
		for (int i = 0; i < 15000; i++) {
			double a = 2*rgen.nextDouble() - 1;
			double b = 2*rgen.nextDouble() - 1;

			if (Math.pow(a, 2.00) + Math.pow(b, 2) < 1) {
				in++;
				all++;
			} else {
				all++;
			}
			System.out.println(closeToPi());
		}

	}

	public static double closeToPi() {
		return (1.0*in / all) * 4;
	}
}
