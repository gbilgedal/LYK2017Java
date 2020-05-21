package tr.org.linux.kamp.aboutfootball;

public abstract class Game implements Playable {
	void hasWinner(String b) {
		System.out.println("Winner is " + b);
	}

}
