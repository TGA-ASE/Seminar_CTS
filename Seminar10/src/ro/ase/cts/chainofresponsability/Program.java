package ro.ase.cts.chainofresponsability;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cont contCurent=new ContCurent(1500,"Andrei",null);
Cont contEconomii=new ContEconomii(2500,"Andrei",null);
Cont contCredit=new ContCredit(3200,"Andrei",null);
Cont contIndisponibil=new ContIndisponibil("Andrei");

contCurent.setSuccesor(contEconomii);
contEconomii.setSuccesor(contCredit);
contCredit.setSuccesor(contIndisponibil);



	}

}
