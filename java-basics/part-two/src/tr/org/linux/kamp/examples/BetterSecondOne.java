package tr.org.linux.kamp.examples;

public class BetterSecondOne {
	public static void main(String[] args) {
		int satir=6;
		for(int i =satir; i>=1;i--) {
			for(int j =i; j>=1;j--) {
				System.out.print(j + " ");
			}
			for (int k=2; k<=i; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}
	}

}
