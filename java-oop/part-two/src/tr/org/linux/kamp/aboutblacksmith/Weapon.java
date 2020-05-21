package tr.org.linux.kamp.aboutblacksmith;

public abstract class Weapon extends Item {
	private int dmgAmount;
	
	public Weapon(int itemQuantity, int itemPrice, double itemWeight, int amount) {
		super(itemQuantity, itemPrice, itemWeight);
		// TODO Auto-generated constructor stub
		dmgAmount = amount;
	}
	public int getDmgAmount() {
		return dmgAmount;
	}
	public void setDmgAmount(int dmgAmount) {
		this.dmgAmount = dmgAmount;
	}
	
}
