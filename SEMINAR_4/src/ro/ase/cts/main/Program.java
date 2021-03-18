package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.lazy.ClinicaVetL;

public class Program {
public static void main(String[] args)
{ ClinicaVeterinara c1=ClinicaVeterinara.getInstanta();
	
ClinicaVeterinara c2=ClinicaVeterinara.getInstanta();
ClinicaVetL c3=ClinicaVetL.getInstance("LazyInit","Vers 1", 96, 6969);
ClinicaVetL c4=ClinicaVetL.getInstance("LazyInit22222","Vers 2", 9996, 7769);


System.out.println(c1.toString());
System.out.println(c2.toString());
System.out.println(c3.toString());
System.out.println(c4.toString());



c3.setBuget(2222);

System.out.println(c3.toString());
System.out.println(c4.toString());
}
}
