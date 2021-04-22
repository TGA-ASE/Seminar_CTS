package ro.ase.cts.strategy.clase;

public class Cash implements ModPlata {

	@Override
	public void plateste( double sumaPlatita) {
		System.out.println(" plateste cash suma de " + sumaPlatita);
	}

}