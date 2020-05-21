package tr.org.linux.kamp.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {
	public static void testLocalDateTime() {
		LocalDateTime currentTime = LocalDateTime.now();

		System.out.println(currentTime);

		Month month = currentTime.getMonth();

		int day = currentTime.getDayOfMonth();

		int sec = currentTime.getSecond();

		System.out.println("Month:" + month + "Day:" + day + "Second:" + sec);

		LocalDateTime timeBending = currentTime.withDayOfMonth(4).withYear(1969);

		System.out.println("Java bent the time :" + timeBending);

		LocalDate dateExample = LocalDate.of(2017, Month.JULY, 8);

		System.out.println(dateExample);

	}

	public static void main(String[] args) {
		testLocalDateTime();
	}
}
