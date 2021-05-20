package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase.Student;

class StudentTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCostructorRightName() {
		String nume = "Andrei";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	void addNotaToList() {

		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);

		assertEquals(nota, student.getNota(0));

	}

	@Test
	void testListSize() {

		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);

		assertEquals(1, student.getNote().size());

	}

	@Test
	void testCalculeazaMediaSinguraNota() {

		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);

		assertEquals(nota, student.calculeazaMedie(), 0.1);

	}

	@Test
	void testCalculeazaMediaFaraNote() {

		Student student = new Student();

		assertEquals(0, student.calculeazaMedie(), 0.1);

	}

	@Test
	void testCalculeazaGetNota() {

		Student student = new Student();

		int nota = 8;
		student.adaugaNota(nota);

		assertThrows(IndexOutOfBoundsException.class, () -> student.getNota(-1));

	}

	@Test
	void testCalculeazaGetNotaJU3() {

		Student student = new Student();

		int nota = 8;
		//1
		try {
			//2
			int x = student.getNota(-1);
			//3
			fail("Testul a esuat pt ca nu a aruncat IndexOutOfBoundsException");
			
		} catch (IndexOutOfBoundsException eroare) {
//4
		}
		//5

	}
	
	@Test
	void testVerificaRestanta() {

		Student student = new Student();

		int nota1 =8;
		int nota2 = 6;
		int nota3 = 8;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);

		assertTrue(student.areRestante());

	}

}
