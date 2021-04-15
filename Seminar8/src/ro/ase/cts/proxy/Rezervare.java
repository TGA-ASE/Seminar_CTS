package ro.ase.cts.proxy;

public class Rezervare implements IRezervare {
	private int nrMasa;
	private int nrPersoane;
	public Rezervare(int nrMasa, int nrPersoane) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
	}
	
	public int getNrPersoane()
	{return nrPersoane;}
	
	public void setNrPersoane(int nrPersoane) {
		this.nrPersoane = nrPersoane;
	}

	@Override
	public void anuntaRezervare()
	{System.out.println("Masa cu numarul: "+nrMasa+"a fost rezervata de "+ nrPersoane);}
}
