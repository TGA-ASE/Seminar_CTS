package ro.ase.cts.adapter.classes;

public class AdapterCreditClass extends Leasing implements InterfataCredit {

	public AdapterCreditClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		// TODO Auto-generated method stub
		super.oferaLeasing(numeClient, suma);
		
	}
	
	

}
