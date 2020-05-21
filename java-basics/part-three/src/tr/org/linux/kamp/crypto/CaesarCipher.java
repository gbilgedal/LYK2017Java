package tr.org.linux.kamp.crypto;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Key please:");
		int key = sc.nextInt();
		sc.nextLine();
		System.out.println("Sentence to encrypt/decrypt please:");
		String text = sc.nextLine();
		System.out.println("To encrypt please press E, to decrypt press D");
		String chosen = sc.nextLine();
		System.out.println(chosen);
		System.out.println("Plaintext or ciphertext is :" + choice(chosen, text, key));
	}

	public static String encrypt(String str, int key) {
		String all = "";
		if (key < 0)
			key = 26 - (-key % 26);
		char msg = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				all += str.charAt(i);
			} else if (Character.isLowerCase(str.charAt(i))) {
				msg = (char) ((str.charAt(i) - 97 + key) % 26);
				msg = (char) ((msg + 97));

				all += (char) msg;
			} else if (Character.isUpperCase(str.charAt(i))) {
				msg = (char) ((str.charAt(i) - 65 + key) % 26);
				msg = (char) ((msg + 65));

				all += (char) msg;
			}

		}
		return all;
	}

	public static String choice(String chosen, String text, int key) {
		if (chosen.equals("E")) {
			return encrypt(text, key);
		}
		if (chosen.equals("D")) {
			return decrypt(text, key);
		}

		else {
			return " Error, try again ";
		}

	}

	public static String decrypt(String str, int key) {

		str.toLowerCase();
		return encrypt(str, -key);

		/*
		 * if(key<0) key = key%26; for(int i = 0; i< str.length(); i++) { char msg =
		 * (char)(str.charAt(i)-97 - key); msg= (char) ((msg%26)+97);
		 * 
		 * all += (char) msg; } return all;
		 */

	}

}