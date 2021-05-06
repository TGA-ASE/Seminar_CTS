package ro.ase.cts.command;

public class Constituire extends Command {

	public Constituire(ContBancar cont,float suma) {
		super(cont,suma);
		// TODO Auto-generated constructor stub
	}

	public void executa() {
		// TODO Auto-generated method stub
		super.getCont().constituire(super.getSuma());
	}



	
	

}
