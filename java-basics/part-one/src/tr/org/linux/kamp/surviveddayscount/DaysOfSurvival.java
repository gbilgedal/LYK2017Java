package tr.org.linux.kamp.surviveddayscount;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class DaysOfSurvival {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Year of birth(write it please):");
		int inputYear = sc.nextInt();
		System.out.println("Month of birth:");
		int inputMonth = sc.nextInt();
		System.out.println("Day of birth(as number):");
		int inputDay = sc.nextInt();
		calcPart(inputYear, inputMonth, inputDay);

	}

	public static void calcPart(int y, int m, int d) {
		LocalDate input = LocalDate.of(y, Month.of(m), d);
		LocalDate currentTime = LocalDate.now();
		// System.out.println(input);
		Month month = currentTime.getMonth();
		int year = currentTime.getYear();

		int day = currentTime.getDayOfMonth();
		long daysBetween = ChronoUnit.DAYS.between(input, currentTime);
		System.out.println("You are surviving your " + daysBetween + "ths day");

	}

}
