package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;

public class AngajatReader extends AplicantReader { // dam cu extend ca sa iasa bn

	public AngajatReader(String file) {
		super(file);
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(getFileName())); // !!!!!!!!!!
		input.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (input.hasNext()) {
			Angajat angajatNr1 = new Angajat();
			super.citesteAplicant(input, angajatNr1);
			int salariu = input.nextInt();
			String ocupatie = input.next();
			angajatNr1.setSalariu(salariu);
			angajatNr1.setOcupatie(ocupatie);
			// asd.set
			angajati.add(angajatNr1);
		}
		input.close();
		return angajati;
	}
}
