package C_PROBLEMA2;

public class FactoryBody implements FactoryCategorie {

	@Override
	public CategorieMedicament CreateCM(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Body(pretDeBaza);
	}

}
