package tr.org.linux.kamp.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A number please >>");
		int[] c = { 3, 2, 14, 12 };
		int a = 5;
		int yas = -10;
		int b = 0;
		try {
			int input = sc.nextInt();
			methodA();
			methodM();
			if (yas < 0) {
				throw new MyException();
			}
			int division = a / b;
			System.out.println(c[c.length]);
			c[100] = 26;
		} catch (Exception e) {
			System.out.println("All exceptions handled");
		}
		/*
		 * catch (InputMismatchException e) { 
		 * System.out.println("input mistaken"); 
		 * }
		 * catch (ArithmeticException e) { 
		 * System.out.println("Exception handled"); 
		 * }
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Array Exception handled"); 
		 * } catch (MyException e) {
		 * System.out.println(e.getMessage()); 
		 * }
		 */
		finally {
			System.out.println("Works all the time");
		}

		System.out.println("It works even though there are exceptions");

	}

	public static void methodA() throws ArithmeticException {
		int d = 5 / 0;
	}

	public static void methodM() {
		try {
			int d = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("MethodM");
		}
	}
}
