package ro.ase.cts.main;

import ro.ase.cts.adapter.classes.AdapterCreditClass;
import ro.ase.cts.adapter.classes.AdapterCreditObj;
import ro.ase.cts.adapter.classes.InterfataCredit;
import ro.ase.cts.adapter.classes.Leasing;

public class Main {
public static void oferaInfoCredit(InterfataCredit credit, String numeClient,float Suma)
{
	credit.acordaCredit(numeClient, Suma);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing=new Leasing();
		AdapterCreditObj aco=new AdapterCreditObj(leasing);
		
		oferaInfoCredit(aco,"Ionel",245.5f);
		
		AdapterCreditClass  acc=new AdapterCreditClass();
		oferaInfoCredit(acc, "Gigel", 322.43f);
	}

}
