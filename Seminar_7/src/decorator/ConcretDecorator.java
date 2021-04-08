package decorator;

public class ConcretDecorator extends AbstractDecorator{

	public ConcretDecorator(ICard card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		// TODO Auto-generated method stub
		System.out.println( super.getCard().getDetinatorCard()+ " a platit contactless");
	}

	@Override
	public String getDetinatorCard() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
