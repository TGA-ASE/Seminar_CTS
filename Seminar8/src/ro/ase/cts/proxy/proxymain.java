package ro.ase.cts.proxy;

public class proxymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRezervare rezervarePentruDouaPersoane=new Rezervare(3,2);
		rezervarePentruDouaPersoane.anuntaRezervare();
		
		ProxyRezervare proxy=new ProxyRezervare((Rezervare)rezervarePentruDouaPersoane);
		((Rezervare)rezervarePentruDouaPersoane).setNrPersoane(4);
		proxy.anuntaRezervare();
		
		

	}

}
