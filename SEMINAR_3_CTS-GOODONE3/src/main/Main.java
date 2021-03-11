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
		
		//System.out.println(Student.getSumaFinantare());
		//System.out.println(Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");
		try {
			Proiect proiect=new Proiect(80);
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat : listaAplicanti)
				{
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(proiect);
				System.out.println(angajat.getSumaFinantare());
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}