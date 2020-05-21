package tr.org.linux.kamp.aboutfootball;

import java.awt.Color;

public class FootballClub extends Club {
	private String stadiumName;
	private int stadiumCapacity;

	public FootballClub(String clubName, Color colors, int clubValue, String stadiumName, int stadiumCapacity) {
		super(clubName, colors, clubValue);
		this.stadiumName = stadiumName;
		this.stadiumCapacity = stadiumCapacity;
	}
	public FootballClub() {
		
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

}
