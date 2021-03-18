package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;

public class Program {
public static void main(String[] args)
{ ClinicaVeterinara c1=ClinicaVeterinara.getInstanta();
	
ClinicaVeterinara c2=ClinicaVeterinara.getInstanta();

System.out.println(c1.toString());
System.out.println(c2.toString());
}
}
