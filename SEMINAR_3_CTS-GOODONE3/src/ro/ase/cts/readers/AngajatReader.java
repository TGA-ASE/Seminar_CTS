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
		Scanner input2 = new Scanner(new File(getFileName())); // !!!!!!!!!!
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (input2.hasNext()) {
			Angajat asd = new Angajat();
			super.citesteAplicant(input2, asd);
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			asd.setSalariu(salariu);
			asd.setOcupatie(ocupatie);
			// asd.set
			angajati.add(asd);
		}
		input2.close();
		return angajati;
	}
}
