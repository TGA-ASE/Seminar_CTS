package C_PROBLEMA2;

public class FactoryGripa implements FactoryCategorie {

	@Override
	public CategorieMedicament CreateCM(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Gripa(pretDeBaza);
	}

}
