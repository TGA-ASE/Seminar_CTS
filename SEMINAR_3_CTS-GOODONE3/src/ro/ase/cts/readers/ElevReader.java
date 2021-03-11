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
		Scanner input2 = new Scanner(new File(getFileName()));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev = new Elev();
			super.citesteAplicant(input2, elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}

}
