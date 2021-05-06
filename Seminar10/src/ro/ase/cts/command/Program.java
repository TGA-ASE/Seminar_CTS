package ro.ase.cts.command;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ManagerComenzi manager=new ManagerComenzi();
manager.invoca(new Constituire(new ContBancar("Andrei"),500));
manager.invoca(new Retragere(new ContBancar("Tudor"),100));
manager.executaComanda();
	}

}
