package decorator;

public abstract class AbstractDecorator implements ICard {
	private ICard card;

	
	
	public ICard getCard() {
		return card;
	}

	public AbstractDecorator(ICard card) {
		super();
		this.card = card;
	}

	@Override
	public void platesteOnline() {
		// TODO Auto-generated method stub
		card.platesteOnline();
	}

	@Override
	public void platesteFizic() {
		// TODO Auto-generated method stub
		card.platesteFizic();
		
		
	}
	@Override
	public String getDetinatorCard()
	{
		
		return card.getDetinatorCard();
		
	}
	
	public abstract void platesteContactless();
	
}
