package main;
import java.io.FileNotFoundException;

import java.util.List;

import ro.ase.cts.classes.*;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;
public class Main {

	public static List<Aplicant> citesteAplicant(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.citesteAplicanti();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Suma finantare pt student: " + Student.getSumaFinantare());
		System.out.println("Suma finantare pt elev: " + Elev.getSumaFinantare());
		System.out.println("Suma finantare pt angajat: " + Angajat.getSumaFinantare());
		
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");

		try {
			listaAplicanti = citesteAplicant(aplicantReader);
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				System.out.println(angajat.getSumaFinantata());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}