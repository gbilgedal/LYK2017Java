package tr.org.linux.kamp.aboutfootball;

public class FootballApp {
	public static void main(String[] args) {
		FootballClub fc1 = new FootballClub();
		FootballClub fc2 = new FootballClub();

		fc1.setClubName("Team A");
		fc2.setClubName("Team B");
		FootballRules rules = new FootballRules(0, 0, fc1, fc2);

		fc1.setStadiumName("Stadium Andro");
		fc2.setStadiumName("Stadium Barito");
		// rules.hasHoliganism(fc2.getClubName());
		rules.setAsGuestTeam(fc1.getClubName());
		rules.setAsHomeTeam(fc2.getClubName());

		System.out.println("Game between " + rules.getHomeTeam() + " & " + rules.getGuestTeam() + " starts");
		rules.moveTheBall();
		rules.anOpponentScores(rules.getHomeTeam());

		System.out.println("Game is getting warmer and warmer. Last game, " + fc1.getClubName() + ""
				+ " has won the game in the last period. Time will show what happens next.");
		rules.anOpponentScores(rules.getHomeTeam());
		rules.hasHoliganism(rules.getHomeTeam());
		rules.endOfFirstHalf();
		System.out.println(rules.getGuestTeam() + ":" + rules.getScoresOfGuestTeam() + "---------------"
				+ rules.getHomeTeam() + ":" + rules.getScoresOfHomeTeam());
		System.out.println(rules.getHomeTeam()
				+ " starts ambitiously. They might take to ball and.... GOOOOAAAAAALLLLLLL!!!!!!!!!!!!");
		rules.anOpponentScores(rules.getHomeTeam());
		System.out.println("Team A should be missing " + fc1.getStadiumName()
				+ "but it seems like there are no mercy in" + fc2.getStadiumName());
		rules.anOpponentScores(rules.getGuestTeam());
		System.out.println("At last " + rules.getGuestTeam() + " strikes.");
		System.out.println(rules.getGuestTeam() + ":" + rules.getScoresOfGuestTeam() + "---------------"
				+ rules.getHomeTeam() + ":" + rules.getScoresOfHomeTeam());
		rules.endOfTheGame();
		if (rules.getScoresOfGuestTeam() > rules.getScoresOfHomeTeam())
			rules.hasWinner(rules.getGuestTeam());
		else if (rules.getScoresOfGuestTeam() < rules.getScoresOfHomeTeam()) {
			rules.hasWinner(rules.getHomeTeam());
		} else {
			System.out.println("Tie.");
		}

	}

}
