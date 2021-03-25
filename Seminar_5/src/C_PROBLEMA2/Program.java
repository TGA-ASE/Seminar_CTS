package C_PROBLEMA2;

import C_PROBLEMA2.FactoryCategorie;
import C_PROBLEMA2.Raceala;
import farmacie.clase.CategorieMedicament;
import farmacie.clase.FarmacieFactory;
import farmacie.clase.TipMedicament;

public class Program {
	public static TipMedicament getTip()
	{return TipMedicament.Body;}
	
	public static FactoryCategorie getTipFactory()
	{return new FactoryGripa();}
	
	public static void printeazaCategorie(FactoryCategorie fabrica,float pretDeBaza) {
		C_PROBLEMA2.CategorieMedicament cm2=fabrica.CreateCM(pretDeBaza);		
		System.out.println(cm2.toString());	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
	printeazaCategorie(getTipFactory(),10);
	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
				
		
	}

}
