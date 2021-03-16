package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import java.util.Scanner;

public abstract class AplicantReader {

	private String fileName;

	public AplicantReader(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;

	}

	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException;

	public void citesteAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();

		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNrProiecte(nr, vect);

	}
}