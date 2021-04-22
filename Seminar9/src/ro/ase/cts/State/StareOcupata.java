package ro.ase.cts.State;

public class StareOcupata  implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
	if(!(masa.getStareMasa() instanceof StareOcupata))
	{
		System.out.println("Masa cu numarul: "+masa.getNrMasa()+" poate fi ocupata");
		
		
		
	}else
	{System.out.println("Masa a fost initial ocupata");}
	}
	
	

}
