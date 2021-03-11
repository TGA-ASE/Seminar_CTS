package ro.ase.cts.classes;

import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.ElevReader;
import ro.ase.cts.readers.StudentReader;
import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader)
			throws NumberFormatException, FileNotFoundException

	{
		return reader.citesteAplicanti();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;

		try {

			listaAngajati = citesteAplicanti(new AngajatReader("angajati.txt")); // hard coded
			for (Aplicant angajat : listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
