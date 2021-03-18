package ro.ase.cts.eager;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int nrDoctori;
	private float buget;
	
	
	
	// Constructorul trebuie obligatoriu sa fie private
	private ClinicaVeterinara(String nume, String adresa, int nrDoctori, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrDoctori = nrDoctori;
		this.buget = buget;
	}

	//private ClinicaVeterinara() {
	//	this.nume = "ClinVet";
	//	this.buget = 777;
	//	this.nrDoctori = 2;
	//	this.adresa="Undeva departe";
	//}
	
	public String getNume() {
		return nume;
		
		
	}
	//instanta statica este initializata la momentul declararii la EagerInitialization
	private static final ClinicaVeterinara instanta = new ClinicaVeterinara("ClinVet","Undeva departe",2,777);
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
	
	
@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", nrDoctori=" + nrDoctori + ", buget="
				+ buget + "]";
	}

	//Functia statica care va return instanta
	public static ClinicaVeterinara getInstanta() {
		return instanta;
	}
	
}
