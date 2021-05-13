package ro.ase.cts.facade;

public class Pacient {
	private String nume;
	private boolean esteInStareGrava;
	public Pacient(String nume, boolean esteInStareGrava) {
		super();
		this.nume = nume;
		this.esteInStareGrava = esteInStareGrava;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public boolean isEsteInStareGrava() {
		return esteInStareGrava;
	}
	public void setEsteInStareGrava(boolean esteInStareGrava) {
		this.esteInStareGrava = esteInStareGrava;
	}
}
