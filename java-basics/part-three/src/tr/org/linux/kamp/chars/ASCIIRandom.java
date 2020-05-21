package tr.org.linux.kamp.chars;
import java.util.Random;

public class ASCIIRandom {
	private static Random rgen= new Random();
	public static void main(String[] args) {
		char a=(char) (rgen.nextInt(26)+65);
		System.out.println(a);
	}

}
