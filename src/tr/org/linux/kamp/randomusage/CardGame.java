package tr.org.linux.kamp.randomusage;

import java.util.Random;

public class CardGame {
	private static Random rgen = new Random();
	public static void main(String[] args) {
		tellRandomCard();
		
	}
	public static String cardSuit() {
		int a = rgen.nextInt(4);
		switch (a) { // use return and make it not void
			case 1:
				return "Maça";
			case 2: 
				return "Karo";
			case 3:
				return "Sinek";
			case 0:
				return "Kupa";
			default :
				return "Hata";
		}
		}
	
    public static String cardRank() {
		int b = rgen.nextInt(13);
		if (b == 0)
			return "As";
		if (2<=b && b<=10)
			return String.valueOf(b);// "" + b
		else
			switch (b) {
			case 11:
				return "Kız";
			case 12:
				return "Papaz";
			case 1:
				return "Joker";
			default:
				return "Hata";
			}
					
	
	}
	
	public static void tellRandomCard() {
		
		System.out.println(cardSuit() + " "+cardRank());
		
	}
		 
		
		
	}

