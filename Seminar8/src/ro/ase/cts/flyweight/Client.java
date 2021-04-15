package ro.ase.cts.flyweight;

public class Client implements FlyweightAbstract {
private String nume;
private String nrTelefon;
private String email;
public Client(String nume, String nrTelefon, String email) {
	super();
	this.nume = nume;
	this.nrTelefon = nrTelefon;
	this.email = email;
}

@Override
public void afisareInformatii(Rezervare rezervare) {
	// TODO Auto-generated method stub
	System.out.println(this.toString()+rezervare.toString());
	
}

@Override
public String toString() {
	return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
}





}
