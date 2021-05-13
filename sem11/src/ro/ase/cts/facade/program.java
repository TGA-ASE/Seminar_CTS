package ro.ase.cts.facade;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pacient p1=new Pacient("dani",false);
		Pacient p2=new Pacient("catalin",true);
		
		System.out.println(FacadeInternarePacient.verificaPacient(p1) );
		System.out.println(FacadeInternarePacient.verificaPacient(p2) );
	}

}
