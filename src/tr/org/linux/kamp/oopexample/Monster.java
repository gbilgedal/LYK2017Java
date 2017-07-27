package tr.org.linux.kamp.oopexample;

abstract class Monster implements Scary {
	private String name;
	abstract void frighten();
	public Monster(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
