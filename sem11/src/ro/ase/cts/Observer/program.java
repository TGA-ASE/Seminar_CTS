package ro.ase.cts.Observer;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClientAbonat c1=new ClientAbonat("Popescu1");
ClientAbonat c2=new ClientAbonat("Popescu2");
ClientAbonat c3=new ClientAbonat("Popescu3");
	
	Sala sala=new Sala("Sala sportiva");
	
	sala.aboneazaClient(c1);
	sala.aboneazaClient(c2);
	sala.aboneazaClient(c3);
	
	sala.anuntaMeci();
	sala.deazaboneazaClient(c1);
	sala.anuntaMeci();
	}

}
