package tr.org.linux.kamp.classes;

public class Human {
	int age;
	String sex;
	String name;

	public Human() {
		System.out.println("A human has been set");
	}

	public Human(String name) {
		this();
		this.name = name;
	}

	public Human(String name, String sex, int age) {
		this();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public void sleepin() {
		System.out.println("A human slept");
	}

	public void eatin() {
		System.out.println("A human ate");
	}

	public void movin() {
		System.out.println("A human moved");
	}

	public void thinkin() {
		System.out.println("A human thought(some of them did not)");

	}

}
