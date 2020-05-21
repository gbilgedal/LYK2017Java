package tr.org.linux.kamp.aboutfootball;

public class FootballRules extends Football {
	private int scoresOfHomeTeam;
	private int scoresOfGuestTeam;
	private String homeTeam;
	private String guestTeam;
	private FootballClub hTeam;
	private FootballClub gTeam;
	

	public FootballRules(int scoresOfHomeTeam, int scoresOfGuestTeam, FootballClub hTeam, FootballClub gTeam) {
		super();
		this.scoresOfHomeTeam = scoresOfHomeTeam;
		this.scoresOfGuestTeam = scoresOfGuestTeam;
		this.hTeam = hTeam;
		this.gTeam = gTeam;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getGuestTeam() {
		return guestTeam;
	}

	public void setGuestTeam(String guestTeam) {
		this.guestTeam = guestTeam;
	}

	public static void main(String[] args) {

	}

	public int getScoresOfHomeTeam() {
		return scoresOfHomeTeam;
	}

	public void setScoresOfHomeTeam(int scoresOfHomeTeam) {
		this.scoresOfHomeTeam = scoresOfHomeTeam;
	}

	public int getScoresOfGuestTeam() {
		return scoresOfGuestTeam;
	}

	public void setScoresOfGuestTeam(int scoresOfGuestTeam) {
		this.scoresOfGuestTeam = scoresOfGuestTeam;
	}

	void endOfFirstHalf() {
		System.out.println("Time is up. Wait for the other period.");
	}

	void endOfTheGame() {
		System.out.println("Game is over");
	}

	void setAsHomeTeam(String a) {
		hTeam = new FootballClub();
		hTeam.setClubName(a);
		homeTeam = hTeam.getClubName();

	}

	void setAsGuestTeam(String v) {
		gTeam = new FootballClub();
		gTeam.setClubName(v);
		guestTeam = gTeam.getClubName();

	}

	@Override
	void anOpponentScores(String b) {

		if (b.equals(homeTeam)) {
			scoresOfHomeTeam += 1;
		} else {
			scoresOfGuestTeam += 1;
		}

	}

	@Override
	void hasHoliganism(String a) {
		System.out.println("Till DEATH do us apart 4eva " + a + "  ARRRRGGGGHHHHHH!!!!!");
		// TODO Auto-generated method stub

	}

}
