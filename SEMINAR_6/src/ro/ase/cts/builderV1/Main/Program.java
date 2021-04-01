package ro.ase.cts.builderV1.Main;
//E 3 (PROBLEMA)
import ro.ase.cts.builderV1.BuilderV1;
import ro.ase.cts.builderV1.Rezervare;

public class Program {

	public static void main(String[] args) {
	Rezervare rezervare=new BuilderV1().setCodRezervare(2).setBauturaRacoritoare(true).build();
	
	System.out.println(rezervare.toString());
	
	Rezervare rezervare2= new BuilderV1().setCodRezervare(3).setMancareInclusa(true).build();
	
	System.out.println(rezervare2.toString());
	
	Rezervare rezervare3= new BuilderV1(123).setGenMuzica("Ceva").build();
	
	System.out.println(rezervare3.toString());

	}

}
