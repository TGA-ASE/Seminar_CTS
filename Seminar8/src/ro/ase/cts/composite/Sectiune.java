package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuniMeniu {
	List<IOptiuniMeniu> lista;
	private String numeSectiune;
	
	public Sectiune(String numeSectiune) {
	
		this.lista = new ArrayList<IOptiuniMeniu>();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void adaugaNod(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		lista.add(optiune);
	}

	@Override
	public void stergeNod(IOptiuniMeniu optiune) {
		// TODO Auto-generated method stub
		lista.remove(optiune);
	}

	@Override
	public IOptiuniMeniu getNod(int index) {
		// TODO Auto-generated method stub
		return lista.get(index);
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Sectiunea: " + numeSectiune+"are urmatoarele subsectiuni: ");for(IOptiuniMeniu optiune:lista)
			optiune.descriere();
	}
	
	

}
