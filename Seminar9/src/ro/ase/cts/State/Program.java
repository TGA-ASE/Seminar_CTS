package ro.ase.cts.State;

public class Program {

	public static void main(String[] args) {
		Masa masa=new Masa(1);
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.setStareMasa(new StareLibera());
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();

	}

}
