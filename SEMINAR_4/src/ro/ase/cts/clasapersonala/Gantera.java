package ro.ase.cts.clasapersonala;

public class Gantera {
private int greutate;
private String numeFirma;
private String material;
private Float pret;
private  static Gantera instanta=null;






private Gantera(int greutate, String numeFirma, String material,Float pret) {
	super();
	this.greutate = greutate;
	this.numeFirma = numeFirma;
	this.material = material;
	this.pret=pret;
}



public int getGreutate() {
	return greutate;
}



public void setGreutate(int greutate) {
	this.greutate = greutate;
}
public String getNumeFirma() {
	return numeFirma;
}
public void setNumeFirma(String numeFirma) {
	this.numeFirma = numeFirma;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}





@Override
public String toString() {
	return "Gantera [greutate=" + greutate + ", numeFirma=" + numeFirma + ", material=" + material + ", pret=" + pret
			+ "]";
}



public static synchronized Gantera getInstanta(int greutate, String firma, String material,Float pret)
{
	if(instanta==null)
		instanta=new Gantera(greutate,firma,material,pret);
	return instanta;
	
}

	
}
