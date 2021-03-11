package ro.ase.cts.classes;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantare=20;
	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int an_studii) {
		this.anStudii = an_studii;
	}

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect,
			String facultate, int an_studii) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.facultate = facultate;
		this.anStudii = an_studii;
	}

	@Override
	public String toString() {
		
				return super.toString()+ "Student:"+ "Facultate=" + facultate + ", An_studii=" + anStudii;
	}

	public int finantare() {
		int s = 20;
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
		return s;
	}

	public  float getSumaFinantare() {
		// TODO Auto-generated method stub
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}

}
