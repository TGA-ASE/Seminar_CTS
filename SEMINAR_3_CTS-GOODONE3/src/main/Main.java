package main;
import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.*;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;
public class Main {
	
	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws FileNotFoundException{
		return reader.citesteAplicanti();
	}
	

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat : listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}