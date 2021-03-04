package ro.ase.cts.readers;
import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Aplicant;


public abstract class AplicantReader{
	
	private String fileName;

	public AplicantReader(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	public String getFileName() {
		return fileName;
		
	}

	
	
	
	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException;
	
}