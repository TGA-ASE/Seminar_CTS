package ro.ase.cts.PrototypeV1;

public class Program {

	public static void main(String[] args) {
	
		Client client1=new Client(100,"Andrei",18);

		Client client2=(Client)client1.copiaza();
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
	}

}
