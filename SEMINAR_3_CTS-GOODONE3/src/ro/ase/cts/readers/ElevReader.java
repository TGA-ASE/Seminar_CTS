package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Elev;
import ro.ase.cts.classes.Aplicant;

public class ElevReader extends AplicantReader {

	public ElevReader(String file) {
		super(file);
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(getFileName()));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev elev = new Elev();
			super.citesteAplicant(input, elev);
			int clasa = input.nextInt();
			String tutore = input.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input.close();
		return elevi;
	}

}
