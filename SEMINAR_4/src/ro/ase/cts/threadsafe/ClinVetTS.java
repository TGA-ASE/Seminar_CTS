package ro.ase.cts.threadsafe;

public class ClinVetTS {
	
	private String nume;
	private String adresa;
	private int nrDoctori;
	private float buget;
	
	
	private  static ClinVetTS instanta=null;


	private ClinVetTS(String nume, String adresa, int nrDoctori, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrDoctori = nrDoctori;
		this.buget = buget;
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
	
	public static synchronized ClinVetTS getInstanta(String nume, String adresa, int nrDoctori, float buget)
	{
		if(instanta==null)
			instanta=new ClinVetTS(nume,adresa,nrDoctori,buget);
		return instanta;
		
	}
	
	

}
