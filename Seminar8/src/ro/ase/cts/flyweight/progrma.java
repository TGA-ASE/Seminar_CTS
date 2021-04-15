package ro.ase.cts.flyweight;

public class progrma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rezervare rez1=new Rezervare(1,3,"12.00");
Rezervare rez2=new Rezervare(3,5,"16.00");

FabricaRezervare fabrica=new FabricaRezervare();
fabrica.getClient("alisa@email.com").afisareInformatii(rez1);
fabrica.getClient("alisa@email.com").afisareInformatii(rez2);
Rezervare rezervare3=new Rezervare(2,4,"17.00");
fabrica.getClient("email").afisareInformatii(rezervare3);
	}

}
