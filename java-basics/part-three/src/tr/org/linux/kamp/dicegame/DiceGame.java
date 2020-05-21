package tr.org.linux.kamp.dicegame;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private static Random rgen1 = new Random();
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Oyuncu 1'in ismi: ");
		String name1 = input.next();
		System.out.println("Oyuncu 2'nin ismi: ");
		String name2 = input.next();
		System.out.println("Zarlar Atılıyor");
		int dice1 = rollin();
		int dice2 = rollin();
		System.out.println("1. zar :" + dice1);
		System.out.println("2. zar :" + dice2);
		if (dice1 > dice2) {
			System.out.println(name1+ " " + dice1 + " ile" +" kazandı.");
		}
		else if (dice1 == dice2) {
			System.out.println("Berabere!");
		}
		else {
			System.out.println(name2 + " " + dice2 +  " ile kazandı.");
		}
		}
	public static int rollin() {
		
		return rgen1.nextInt(5) + 1;
		
		
	}
	

}
