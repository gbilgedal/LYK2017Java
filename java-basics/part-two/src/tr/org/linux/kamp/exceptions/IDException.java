package tr.org.linux.kamp.exceptions;

public class IDException extends Exception {
	public String getMessage() {
		return "Your ID should not contain more than 11 numbers";
	}


}
