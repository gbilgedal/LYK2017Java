package tr.org.linux.kamp.email;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mail = input.next();
		System.out.println(isMailValid(mail));

	}

	public static boolean isMailValid(String str) {
		if (str.indexOf(' ') != -1)
			return false;
		if (str.startsWith(str, '@') || str.startsWith(str, '.'))
			// str.charAt(0) == '@' && str.charAt(0) == '.'
			return false;
		if (str.indexOf('@') == -1)
			return false;
		if (str.indexOf('.') == -1)
			return false;
		if (str.indexOf('@') == str.indexOf('.') + 1 || str.indexOf('@') + 1 == str.indexOf('.'))
			return false;
		if (str.lastIndexOf('.') >= str.length() - 2)
			return false;
		else
			return true;

	}

}
