package tr.org.linux.kamp.oopbeginning;

abstract class Animal {
	private String eyeColour;
	private String furColour;
	private int age;
	private String specie;
	public Animal(String eyeColour, String furColour, int age, String specie) {
		
		this.eyeColour = eyeColour;
		this.furColour = furColour;
		this.age = age;
		this.specie = specie;
	}
	public String getEyeColour() {
		return eyeColour;
	}
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	public String getFurColour() {
		return furColour;
	}
	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecie() {
		return specie;
	}
	public void setSpecie(String specie) {
		this.specie = specie;
	}

}
