package tr.org.linux.kamp.aboutfootball;

import java.awt.Color;

public class Club {
	public Club(String clubName, Color colors, int clubValue) {
		super();
		this.clubName = clubName;
		this.colors = colors;
		this.clubValue = clubValue;
	}
	public Club() {
		
	}
	private String clubName;
	private Color colors;
	private int clubValue;
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public Color getColors() {
		return colors;
	}
	public void setColors(Color colors) {
		this.colors = colors;
	}
	public int getClubValue() {
		return clubValue;
	}
	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}
}
