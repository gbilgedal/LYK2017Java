package tr.org.linux.kamp.sphere;

import java.util.Scanner;

public class SphereVolume {

	static double pi = Math.PI;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Radius Please>>");
		int r = input.nextInt();
		System.out.println("Volume is " + getVolume(r));

	}

	public static double getVolume(int r) {
		return (4 / 3) * pi * Math.pow(r, 2);
	}

}
