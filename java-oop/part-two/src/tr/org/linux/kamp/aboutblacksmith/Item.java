package tr.org.linux.kamp.aboutblacksmith;

public abstract class Item {
	private int itemQuantity;
	private int itemPrice;
	private double itemWeight;

	void useItem() {

	}// foreach add 1 to quantity

	public Item(int itemQuantity, int itemPrice, double itemWeight) {
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
		this.itemQuantity++;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}

}
