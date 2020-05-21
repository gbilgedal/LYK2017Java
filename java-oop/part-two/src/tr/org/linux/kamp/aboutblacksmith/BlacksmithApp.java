package tr.org.linux.kamp.aboutblacksmith;

public class BlacksmithApp {
	public static void main(String[] args) {
		// hero's name is eira;
		System.out.println("The Great Hero Eira is on a journey now.");
		Armor eirasarmor = new Armor(1, 250, 12.50, true, 275);
		Bow eirasbow = new Bow(1, 1, 3.75, 190, 120);
		Sword esword = new Sword(1, 234, 13, 175);
		System.out.println("Eira took his/her bow and suited up his/her armor.");
		System.out.println("While she/he was in the journey. She/he saw a flying sword and it was evil.");
		eirasarmor.getHit(esword);
		System.out.println("The evil sword has had " + esword.getDmgAmount() + " damage.");
		System.out.println("His/her defence left:" + eirasarmor.getDefPoints());
		eirasbow.useItem();
		System.out.println("The evil sword died with -15 defence points.");
		System.out.println("She/he has " + eirasbow.getItemQuantity() + " items");
		System.out.println("She/he went to a strong blacksmith.");
		eirasarmor.upgrade();
		System.out.println("Bought some arrows ");
		eirasbow.upgrade();
		System.out.println("upgraded his/her armor.");
		System.out.println(eirasbow.getNumberOfArrows() + " arrows, " + eirasarmor.getDefPoints() + " defence points");

	}

}
