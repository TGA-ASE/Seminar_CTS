package classes;

public class Zebra extends Animal{
	
	private int dungi;

	public Zebra(String name, float greutate, int dungi) {
		super(name, greutate);
		this.dungi = dungi;
	}

	public int getDungi() {
		return dungi;
	}

	public void setDungi(int dungi) {
		this.dungi = dungi;
	}
	
	public Zebra(String name, float greutate) {
		super(name, greutate);
	
	}

}
