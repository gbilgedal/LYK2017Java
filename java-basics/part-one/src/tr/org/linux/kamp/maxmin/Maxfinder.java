package tr.org.linux.kamp.maxmin;

import java.util.Scanner;

public class Maxfinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen aralarına boşluk koyarak üç sayı tanımlayınız");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double result = maximum(number1, number2, number3);
		
		System.out.println("En büyük sayı: " + result);
		
			
	}
	
	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		
		if(y > maximumValue)
			maximumValue = y;
		if(z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
		
	}

}
