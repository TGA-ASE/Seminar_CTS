package ro.ase.cts.command;

public class ContBancar {
	
	private String detinator;
	private float suma;
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		
	}
	
	public ContBancar(String detinator, float suma) {
		super();
		this.detinator = detinator;
		this.suma = suma;
	}
	
	public void constituire (float suma)
	{
		
		System.out.println("Contul a fost constituit");
		this.suma=suma;
		
	}
	
	public void retragere(float x)
	{
		if(this.suma>=x)
		{System.out.println("O retragere de " +x+" a fost efectuata");
		this.suma=this.suma-x;
		}
		else
			System.out.println("Fonduri insuficiente");
	}
	
	public void depunere(float x)
	{
		
		System.out.println("O depunere de " +x+" a fost efectuata");
		this.suma=this.suma+x;
	
	}
	
	
	

}
