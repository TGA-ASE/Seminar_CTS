package ro.ase.cts.Observer;

import java.util.List;

public class Sala implements Subiect {
private List<Observer> observeri;
private String numeSala;


	public Sala(String numeSala) {
	super();
	this.numeSala = numeSala;
}

	@Override
	public void aboneazaClient(Observer observer) {
		observeri.add(observer);
		
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer obs:observeri) {obs.receptionareMesaj(numeSala+" : "+mesaj);}
	}

	@Override
	public void deazaboneazaClient(Observer observer) {
		observeri.remove(observer);
		
	}
	
	public void anuntaMeci()
	{}

}
