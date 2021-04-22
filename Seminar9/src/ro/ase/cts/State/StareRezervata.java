package ro.ase.cts.State;

public class StareRezervata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof StareLibera)
		{System.out.println("Ati rezervat masa cu numaru:" +masa.getNrMasa());
		masa.setStareMasa(this);
		}
		else System.out.println("Masa selectata nu este disponibila" );
			
		
	}
	
	

}
