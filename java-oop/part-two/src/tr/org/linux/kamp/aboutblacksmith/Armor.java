package tr.org.linux.kamp.aboutblacksmith;

public class Armor extends Item implements Upgradable {
	private int defPoints;
	private boolean isWorn;

	public Armor(int itemQuantity, int itemPrice, double itemWeight, boolean used, int defPoints) {
		super(itemQuantity, itemPrice, itemWeight);
		// TODO Auto-generated constructor stub
		isWorn = used;
		this.defPoints = defPoints;
	}

	public void getHit(Weapon a ) {
		if(isWorn) {
			if(defPoints>a.getDmgAmount()) {
				defPoints -= a.getDmgAmount();
				
			}
			else {

			System.out.println("Our hero had not enough armor so he/she died.");
			System.exit(0);
			}}
		
	}

	@Override
	public void upgrade() {
		defPoints += 100;
		// TODO Auto-generated method stub
	}

	public int getDefPoints() {
		return defPoints;
	}

	public void setDefPoints(int defPoints) {
		this.defPoints = defPoints;
	}

	public boolean isWorn() {
		return isWorn;
	}

	public void setWorn(boolean isWorn) {
		this.isWorn = isWorn;
	}
}
