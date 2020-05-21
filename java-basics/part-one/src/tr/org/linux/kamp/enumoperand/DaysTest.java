package tr.org.linux.kamp.enumoperand;

public class DaysTest {
	static Days day;
	public DaysTest(Days day) {
		this.day = day;
	}
	public static void tellAboutDay() {
		switch (day) {
		case MON:
			System.out.println("sucks");
			break;
		case FRI:
			System.out.println("is lovely");
			break;
		case SAT:
			System.out.println("the best");
			break;
		
		default:
			System.out.println("meh");
		}
	}
	public static void main(String[] args) {
		DaysTest firstDay = new DaysTest(Days.MON);
				firstDay.tellAboutDay();
	}

}
