package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.IStudent;

public class TestCaseDummyT {

	private IStudent studentDummy;
	
	@Before
	public void setUp() throws Exception {
		studentDummy = new StudentDummyT();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdaugaStudent() {
		Grupa grupa = new Grupa(1000);
		grupa.adaugaStudent(studentDummy);
		assertEquals(1, grupa.getListaStudenti().size());
	}
	
	@Test
	public void testAdaugaStudentCardinality() {
		Grupa grupa = new Grupa(1000);
		IStudent studentDummy1 = new StudentDummyT();
		IStudent studentDummy2 = new StudentDummyT();
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy1);
		grupa.adaugaStudent(studentDummy2);
		assertEquals(3, grupa.getListaStudenti().size());
	}
}