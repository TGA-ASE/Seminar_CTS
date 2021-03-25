package Main;

import farmacie.clase.CategorieMedicament;
import farmacie.clase.FarmacieFactory;
import farmacie.clase.TipMedicament;

public class Program {
	public static TipMedicament getTip()
	{return TipMedicament.Body;}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FarmacieFactory ff=new FarmacieFactory();
		try {
			CategorieMedicament durere= ff.createMed(TipMedicament.Durere,5);
			CategorieMedicament body= ff.createMed(TipMedicament.Body,10);
			CategorieMedicament categorie= ff.createMed(getTip(),15);
	System.out.println(durere.toString());	
	System.out.println(body.toString());
	System.out.println(categorie.toString());
	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
				
		
	}

}
