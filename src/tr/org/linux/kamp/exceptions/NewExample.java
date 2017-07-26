package tr.org.linux.kamp.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//ogrenci
// ID and Grade Exceptions
public class NewExample {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Student myStdent = new Student();

		// System.out.println("Name please");
		// String name = sc.next();
		// myStdent.setName(name);
		// System.out.println("ID please");
		// String id = sc.next();
		// myStdent.setId(id);
		// System.out.println("Grade Please");
		// int grade = sc.nextInt();
		// myStdent.setGra(grade);
		// System.out.println("Welcome "+name);
		try {
			System.out.println("Name please");
			String name = sc.next();
			myStdent.setName(name);
			System.out.println("ID please");
			String id = sc.next();
			myStdent.setId(id);
			System.out.println("Grade Please");
			int grade = sc.nextInt();
			myStdent.setGra(grade);
			myStdent.graCheck(grade);
			myStdent.idCheck(id);
			System.out.println("Welcome " + name);
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}

		catch (IDException e) {
			System.out.println("Your ID should not contain more than 11 numbers");
		} catch (GradeException e) {
			System.out.println("Your grade should be between 0 and 100");
		}

		// Student.graCheck(grade);
		// Student.idCheck(id);
		// System.out.println(name + id + grade);

	}
}
