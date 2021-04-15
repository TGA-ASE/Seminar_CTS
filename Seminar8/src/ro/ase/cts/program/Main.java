package ro.ase.cts.program;

import ro.ase.cts.composite.IOptiuniMeniu;
import ro.ase.cts.composite.Item;
import ro.ase.cts.composite.Sectiune;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IOptiuniMeniu meniu=new Sectiune("Meniu restaurant");
		IOptiuniMeniu optiune1=new Sectiune("bauturi");
		IOptiuniMeniu optiune2=new Sectiune("desert");
		
		IOptiuniMeniu item1=new Item("frappe");
		IOptiuniMeniu item3=new Item("apa plata");
		IOptiuniMeniu item2=new Item("tiramisu");
		try {
			optiune1.adaugaNod(item1);	optiune2.adaugaNod(item2);
	
		optiune1.adaugaNod(item3);
		
		meniu.adaugaNod(optiune1);
		meniu.adaugaNod(optiune2);
		meniu.descriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
