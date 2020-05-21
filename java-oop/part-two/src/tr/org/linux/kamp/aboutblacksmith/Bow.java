package tr.org.linux.kamp.aboutblacksmith;

public class Bow extends Weapon implements Upgradable {
	private int numberOfArrows;

	public Bow(int itemQuantity, int itemPrice, double itemWeight, int dmgamount, int numberOfArrows) {
		super(itemQuantity, itemPrice, itemWeight, dmgamount);
		// TODO Auto-generated constructor stub
		this.numberOfArrows = numberOfArrows;
	}

	public int getNumberOfArrows() {
		return numberOfArrows;
	}

	public void setNumberOfArrows(int numberOfArrows) {
		this.numberOfArrows = numberOfArrows;
	}

	@Override
	public void upgrade() {
		numberOfArrows += 10;

	}

	@Override
	void useItem() {
		if (numberOfArrows > 0) {
			System.out.println("An arrow has been shot.");
			numberOfArrows--;
		}
	}

}
