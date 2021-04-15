package ro.ase.cts.flyweight;
import java.util.HashMap;
import java.util.Map;
public class FabricaRezervare {
private Map<String,FlyweightAbstract> clienti;

public FabricaRezervare(Map<String, Rezervare> clienti) {
	super();
	this.clienti = new HashMap<String,FlyweightAbstract>();
}

public FabricaRezervare() {
	// TODO Auto-generated constructor stub
}

public FlyweightAbstract getClient(String email)

{
	FlyweightAbstract client=clienti.get(email);
	if(client==null)
	{client=new Client("Alisa","0728945612",email);
	clienti.put(email,client);
	
	}
	return client;
}




}
