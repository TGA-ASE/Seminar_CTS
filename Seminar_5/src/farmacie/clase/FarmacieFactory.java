package farmacie.clase;

public class FarmacieFactory {
	
	public CategorieMedicament createMed(TipMedicament tipMedicament,float pretDeBaza) throws Exception {
		switch (tipMedicament) {
		case Body:
			return new Body(pretDeBaza);
		case Durere:
			return new Durere(pretDeBaza);
		case Raceala:
			return new Raceala(pretDeBaza);
		default:
			throw new Exception("Categorie primita nu este corect");
		}
	}

}
