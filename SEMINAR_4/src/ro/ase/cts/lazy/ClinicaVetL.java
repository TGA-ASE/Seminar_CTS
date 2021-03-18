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
	
	
}
	
	

