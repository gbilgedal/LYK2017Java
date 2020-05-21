package tr.org.linux.kamp.student;

public class StudentApp {
	public static void main(String[] args) {
		Student stu1 = new Student("O", 96);
		System.out.println(stu1.getName() + "nun harf notu:" + stu1.getLetterGrade());
	}

}
