package tr.org.linux.kamp.exceptions;

public class Student {
	int gra;
	String id;
	String name;

	public  void graCheck(int grade) throws GradeException {
		if (0 < grade && grade < 100) {
			this.gra=grade;
			System.out.println("Your grade is " + grade);
		} else
			throw new GradeException();

	}

	public void idCheck(String id) throws IDException {
		if (id.length() < 11 || id.length() > 11) {

			throw new IDException();
		} else
			this.id=id;
			System.out.println("Your id is " + id);
	}

	public int getGra() {
		return gra;
	}

	public void setGra(int gra) {
		this.gra = gra;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
