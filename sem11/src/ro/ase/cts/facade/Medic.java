package ro.ase.cts.facade;

public class Medic {
private String nume;
private String specializare;

public Medic(String nume, String specializare) {
	super();
	this.nume = nume;
	this.specializare = specializare;
}

public boolean esteNecesaraInternarea(Pacient pacient)
{if(pacient.isEsteInStareGrava())
{
	return true;}
else
{return false;}
	
}
}
