package tr.org.linux.kamp.exceptions;

public class GradeException extends Exception {
	public String  getMessage() {
		return "Your grade should be between 0 and 100";
	}
	
}
