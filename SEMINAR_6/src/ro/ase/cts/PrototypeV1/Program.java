package ro.ase.cts.PrototypeV1;

public class Program {

	public static void main(String[] args) {
	
		Client client1=new Client(100,"Andrei",18);

		Client client2=(Client)client1.copiaza();
		Bilet bilet1=new Bilet(0,"Steaua","Dinamo","25/04/2021");
		Bilet bilet2=(Bilet)bilet1.copiaza();
		bilet2.setCod(1);
		Bilet bilet3=(Bilet)bilet1.copiaza();
		bilet3.setCod(2);
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
		
		
		System.out.println(bilet2.toString());
		System.out.println(bilet3.toString());
	}

}
