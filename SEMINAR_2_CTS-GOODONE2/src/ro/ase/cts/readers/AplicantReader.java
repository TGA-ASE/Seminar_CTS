package ro.ase.cts.readers;
import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Aplicant;


public abstract class AplicantReader {
	
	public abstract List<Aplicant> citesteAplicanti(String file) throws FileNotFoundException, NumberFormatException;
	
		
		
		
	

}
