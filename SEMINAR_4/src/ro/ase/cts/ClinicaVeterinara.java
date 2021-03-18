package ro.ase.cts;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int nrDoctori;
	private float buget;
	
	private ClinicaVeterinara() {
		this.nume = "ClinVet";
		this.buget = 777;
		this.nrDoctori = 2;
		this.adresa="Undeva departe";
	}
	
	public String getNume() {
		return nume;
		
		
	}
	private static final ClinicaVeterinara instanta = new ClinicaVeterinara();
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
	public static ClinicaVeterinara getInstanta(String nume ,String adresa, int nrDoctori, float capital) {
		return instanta;
	}
	
}
