package tr.org.linux.kamp.strs;

public class ClassOfStrings {

	public static void main(String[] args) {
	//	String str = "Hello Java!";
		String strw ="helloolleh";
		// str objects id's are different in memo
		if ("hello" == "hello") {// substring method
			System.out.println("lel");// indexOf search method
		}
	//	System.out.println(upNow(str));
		System.out.println(reverse(strw));
		System.out.println(isPalindrome(strw));
		//System.out.println(isPalindrome(str));

	}

	public static String upNow(String string) {
		String last = "";
		for (int i = 0; i < string.length(); i++) {
			last += Character.toUpperCase(string.charAt(i));
		}
		return last;

	}

	public static String reverse(String str) {
		String last = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			last += str.charAt(i);

		}

		for (int i = 0; i < str.length(); i++) {
			last += str.charAt(str.length() - 1 - i);
		}
		return last;
	}
	public static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}

}
