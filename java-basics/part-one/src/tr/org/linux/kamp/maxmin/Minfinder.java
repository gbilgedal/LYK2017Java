package tr.org.linux.kamp.maxmin;
import java.util.Scanner;

public class Minfinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen aralarında boşluk bırakarak iki sayı giriniz");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double result = min(number1,number2);
		System.out.println("min değer:" + result);

}

	public static double min(double a, double b) {
		double minval = a;
		if (a>b) {
			minval =b;
		}
		return minval;
		}
}
