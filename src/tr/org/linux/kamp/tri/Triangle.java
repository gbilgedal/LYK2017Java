package tr.org.linux.kamp.tri;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please write in the values of triangle's sides and press enter:");
		int a = input.nextInt();
		int b = input.nextInt();
		int hipo = getHypo(a, b);
		System.out.println("Its hypotenuse:" + hipo);
		System.out.println("Its area:" + getArea(a, b));
		System.out.println("Its perimeter:" + getPerimeter(a, b, hipo));

	}

	public static double getArea(int a, int b) {
		return (a * b) / 2.00;
	}

	public static int getPerimeter(int a, int b, int hip) {
		return a + b + hip;
	}

	public static int getHypo(int a, int b) {
		return (int) Math.hypot(a, b);

	}
}
