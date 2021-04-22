package ro.ase.cts.State;

public class StareLibera implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareLibera))
		{
			System.out.println("Masa cu numarul" +masa.getNrMasa() +" a fost eliberata");
			masa.setStareMasa(this);
			
			
		}
		
		
		
	}

}
