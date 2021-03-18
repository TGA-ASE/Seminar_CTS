package ro.ase.cts.lazy;

public class ClinicaVetL {
	private String nume;
	private String adresa;
	private int nrDoctori;
	private float buget;
	
	private static ClinicaVetL instanta=null;
	
	private ClinicaVetL(String nume, String adresa, int nrDoctori, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrDoctori = nrDoctori;
		this.buget = buget;
	}
	
	public static ClinicaVetL getInstance(String nume, String adresa, int nrDoctori, float buget)
	{if (instanta == null) {
		instanta = new ClinicaVetL(nume, adresa, nrDoctori,buget);
	}
	return instanta;
	}

	@Override
	public String toString() {
		return "ClinicaVetL [nume=" + nume + ", adresa=" + adresa + ", nrDoctori=" + nrDoctori + ", buget=" + buget
				+ "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNrDoctori() {
		return nrDoctori;
	}

	public void setNrDoctori(int nrDoctori) {
		this.nrDoctori = nrDoctori;
	}

	public float getBuget() {
		return buget;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}
	
	
	
	
	
}
	
	

