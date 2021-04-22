package ro.ase.cts.strategy.clase;

public class Card implements ModPlata {
	
	private double sold;

	public Card(double sold) {
		super();
		this.sold = sold;
	}

	@Override
	public void plateste( double sumaPlatita) {
		if(sold>=sumaPlatita)
		{System.out.println("Se plateste cu cardul suma: "+sumaPlatita);
		
		
		}
		else
		{System.out.println("Fonduri insuficiente ");
		}
		
	}
	
	

}
