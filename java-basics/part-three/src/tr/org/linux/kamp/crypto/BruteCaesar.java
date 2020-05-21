package tr.org.linux.kamp.crypto;

public class BruteCaesar {
	public static void main(String[] args) {
		System.out.println("Hellos");
		String cipher = "Ohhurb Mhqnlqv";
		System.out.println(bruter(cipher));
	}

	public static String bruter(String msg) {
		String all = "";
		char note = ' ';
		for (int key = 0; key <= 26; key++) {

			for (int i = 0; i < msg.length(); i++) {

				if (!Character.isLetter(msg.charAt(i))) {
					all += msg.charAt(i);
				} else if (Character.isLowerCase(msg.charAt(i))) {
					note = (char) ((msg.charAt(i) - 97 - key) % 26);
					note = (char) ((note + 97));

					all += (char) note;
				} else if (Character.isUpperCase(msg.charAt(i))) {
					note = (char) ((msg.charAt(i) - 65 - key) % 26);
					note = (char) ((note + 65));

					all += (char) note;
				}

			}
			System.out.println(all);
			
		}
		System.out.println();
		return all;
		
	}
}
