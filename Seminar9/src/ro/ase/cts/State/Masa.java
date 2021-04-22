package ro.ase.cts.State;

public class Masa {
	
	private StareMasa stareMasa;
	private int nrMasa;
	public Masa( int nrMasa) {
		super();
		this.stareMasa = new StareLibera();
		this.nrMasa = nrMasa;
	}
	public StareMasa getStareMasa() {
		return stareMasa;
	}
	public void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	public void rezervaMasa()
	{ modificaStareMasa(new StareRezervata());
		
	}
	
	public void ocupaMasa()
	{
		modificaStareMasa(new StareOcupata());
	}
	
	public void elibereazaMasa()
	{
		
modificaStareMasa(new StareLibera());
}
	public void modificaStareMasa(StareMasa stare)
	{stare.modificaStare(this);}
}
