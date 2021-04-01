package ro.ase.cts.PrototypeV1;

import java.util.ArrayList;
import java.util.List;

public class Client implements IClient {
	
	private int codClient;
	private String nume;
	private int varsta;
	
	
	//validarea varstei
	public Client(int codClient, String nume, int varsta) {
		super();
		this.codClient = codClient;
		this.nume = nume;
		this.varsta = varsta;
	}



	@Override
	public String toString() {
		return "Client [codClient=" + codClient + ", nume=" + nume + ", varsta=" + varsta + "]";
	}



	private Client() {
		super();
	}



	@Override
	public IClient copiaza() {
		Client client=new Client();
		client.codClient=this.codClient;
		client.varsta=this.varsta;
		client.nume=this.nume;
		
		return client;
	}


	

	
}
