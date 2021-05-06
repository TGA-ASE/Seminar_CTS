package ro.ase.cts.chainofresponsability;

public class ContEconomii extends Cont {

	public ContEconomii(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		// TODO Auto-generated method stub
		if(super.getSold()>=suma)
		{System.out.println(super.getNumeClient()+"a realizat plata de: "+suma+"din contul de economii");
		}
	}

}
